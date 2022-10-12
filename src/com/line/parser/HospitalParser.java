package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] split = str.split(",");
        return new Hospital(split[0]);

    }
}
