package org.handsome.rpc.share.test;

import org.handsome.rpc.share.test.dto.TestDTO;

public interface TestService {
	TestDTO get(Integer id);
}
