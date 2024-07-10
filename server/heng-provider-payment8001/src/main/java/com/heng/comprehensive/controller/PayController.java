package com.heng.comprehensive.controller;

import com.heng.comprehensive.entities.Pay;
import com.heng.comprehensive.entities.dto.PayDto;
import com.heng.comprehensive.service.IPayService;
import com.heng.comprehensive.utils.BeanCopyUtil;
import com.heng.comprehensive.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import lombok.Value;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @FileName PayController
 * @Description
 * @Author zhaoheng
 * @date 2024-07-10 00:30
 **/
@RestController
@RequestMapping("/")
public class PayController {
    @Resource
    private IPayService payService;

//    @Value("${server.port}")
    private Integer port;

    @PostMapping("/add")
    @Operation(summary = "新增", description = "新增支付流水, 参数是JSON字符串")
    public Result<Integer> addPay(@RequestBody PayDto payDto) {
        try {
            Pay pay = new Pay();
            BeanUtils.copyProperties(payDto, pay);
            return Result.success(payService.add(pay));
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }
    }

    @DeleteMapping("/del/{id}")
    @Operation(summary = "删除", description = "删除支付流水, 参数是Id")
    public Result<Integer> deletePay(@PathVariable("id") Integer id) {
        try {
            return Result.success(payService.delete(id));
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }
    }

    @PutMapping("/update")
    @Operation(summary = "更新", description = "更新支付流水, 参数是JSON字符串, 根据Id更新")
    public Result<Integer> updatePay(@RequestBody PayDto payDto) {
        try {
            Pay pay = new Pay();
            BeanUtils.copyProperties(payDto, pay);
            return Result.success(payService.update(pay));
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }
    }

    @GetMapping("/get/{id}")
    @Operation(summary = "查询单个", description = "查询支付流水, 参数是Id")
    public Result<PayDto> getById(@PathVariable("id") Integer id) {
        PayDto payDto = new PayDto();
        BeanUtils.copyProperties(payService.getById(id), payDto);
        return Result.success(payDto);
    }

    @GetMapping("/getAll")
    @Operation(summary = "查询所有", description = "查询所有支付流水")
    public Result<List<PayDto>> getAll() {
        try {
            List<Pay> pays = payService.getAll();
            List<PayDto> payDTOs = BeanCopyUtil.copyListProperties(pays, PayDto::new);
            return Result.success(payDTOs);
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }
    }

    @GetMapping("/getInfo/{info}")
    public Result<String> getInfo(@PathVariable String info) {
        try {
            TimeUnit.SECONDS.sleep(62);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Result.success("port: " + port + "\t Info: " + info);
    }
}