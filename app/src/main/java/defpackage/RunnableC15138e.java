package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۨۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC15138e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f29935e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f29936e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6339e f29937e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29938e;

    public /* synthetic */ RunnableC15138e(C6339e c6339e, String str, long j, int i) {
        this.f29938e = i;
        this.f29936e = str;
        this.f29935e = j;
        this.f29937e = c6339e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29938e) {
            case 0:
                C6339e c6339e = this.f29937e;
                c6339e.mo2250e();
                String str = this.f29936e;
                AbstractC9528e.purchase(str);
                C2271e c2271e = c6339e.f13181e;
                boolean isEmpty = c2271e.isEmpty();
                long j = this.f29935e;
                if (isEmpty) {
                    c6339e.f13179e = j;
                }
                Integer num = (Integer) c2271e.get(str);
                if (num != null) {
                    c2271e.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (c2271e.f34352e < 100) {
                    c2271e.put(str, 1);
                    c6339e.f13180e.put(str, Long.valueOf(j));
                    return;
                } else {
                    C13879e c13879e = ((C6936e) c6339e.f36443e).f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27495e.ad("Too many ads visible");
                    return;
                }
            default:
                C6339e c6339e2 = this.f29937e;
                C6936e c6936e = (C6936e) c6339e2.f36443e;
                c6339e2.mo2250e();
                String str2 = this.f29936e;
                AbstractC9528e.purchase(str2);
                C2271e c2271e2 = c6339e2.f13181e;
                Integer num2 = (Integer) c2271e2.get(str2);
                if (num2 == null) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.vip(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    return;
                }
                C10693e c10693e = c6936e.f14200e;
                C13879e c13879e3 = c6936e.f14227e;
                C6936e.billing(c10693e);
                C13288e m2914e = c10693e.m2914e(false);
                int intValue = num2.intValue() - 1;
                if (intValue != 0) {
                    c2271e2.put(str2, Integer.valueOf(intValue));
                    return;
                }
                c2271e2.remove(str2);
                C2271e c2271e3 = c6339e2.f13180e;
                Long l = (Long) c2271e3.get(str2);
                long j2 = this.f29935e;
                if (l == null) {
                    C6936e.yandex(c13879e3);
                    c13879e3.f27502e.ad("First ad unit exposure time was never set");
                } else {
                    long longValue = j2 - l.longValue();
                    c2271e3.remove(str2);
                    c6339e2.m2153e(str2, longValue, m2914e);
                }
                if (c2271e2.isEmpty()) {
                    long j3 = c6339e2.f13179e;
                    if (j3 == 0) {
                        C6936e.yandex(c13879e3);
                        c13879e3.f27502e.ad("First ad exposure time was never set");
                        return;
                    } else {
                        c6339e2.m2157e(j2 - j3, m2914e);
                        c6339e2.f13179e = 0L;
                        return;
                    }
                }
                return;
        }
    }
}
