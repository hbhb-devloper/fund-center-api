package com.hbhb.cw.fundcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaokang
 * @since 2020-12-24
 */
public interface NoticeApi {

    @GetMapping("/count")
    Long countNotice(@RequestParam("id") Integer id);
}
