var containsNearbyDuplicate = function (nums, k) {
  let hash = {};
  for (let i = 0; i < nums.length; i++) {
    let num = nums[i];
    if (hash.hasOwnProperty(num)) {
      let diff = Math.abs(hash[num] - i);
      if (diff <= k) return true;
    }
    hash[num] = i;
    console.log(hash);
  }
  return false;
};

console.log(containsNearbyDuplicate([1, 2, 3, 1], 3));
