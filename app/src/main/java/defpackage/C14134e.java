package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14134e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f27947e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27948e;

    public /* synthetic */ C14134e(long j, int i) {
        this.f27948e = i;
        this.f27947e = j;
    }

    public /* synthetic */ C14134e(C11698e c11698e, long j) {
        this.f27948e = 0;
        this.f27947e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13578e c13578e;
        Object c12763e;
        int i = this.f27948e;
        boolean z = false;
        z = false;
        long j = this.f27947e;
        switch (i) {
            case 0:
                C1372e c1372e = (C1372e) obj;
                Long advert = C11698e.advert(c1372e.ad, c1372e.vip);
                if (advert != null && advert.longValue() < j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                C8953e c8953e = (C8953e) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (c8953e.f17969e.yandex() >> 32)) / 2.0f;
                return c8953e.ad(new C1893e(intBitsToFloat, AbstractC9357e.appmetrica(c8953e, intBitsToFloat), new C2815e(j, 5), z ? 1 : 0));
            case 2:
                C4017e c4017e = (C4017e) obj;
                c4017e.ad();
                List startapp = AbstractC6874e.startapp(new C3618e(C3618e.vip(0.2f, j)), new C3618e(j));
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.f28537e.m4560try() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                C18478e c18478e = c4017e.f8940e.f28537e;
                AbstractC4653e.admob(c4017e, new C11078e(startapp, null, floatToRawIntBits, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18478e.m4560try() >> 32)) / 2.0f) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18478e.m4560try() & 4294967295L)))), 0), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 3:
                C17223e c17223e = (C17223e) obj;
                Function1 function1 = c17223e.vip;
                if (function1 != null && (c13578e = c17223e.ad) != null) {
                    try {
                        c12763e = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        c12763e = new C12763e(th);
                    }
                    c13578e.billing(c12763e);
                }
                return Unit.INSTANCE;
            case 4:
                ((InterfaceC15671e) obj).appmetrica(AbstractC1163e.metrica, new C4167e(EnumC12813e.f25633e, this.f27947e, 2, true));
                return Unit.INSTANCE;
            case 5:
                return Long.valueOf(j);
            case 6:
                ((C0044e) obj).license(C7551e.vip, Long.valueOf(j));
                return null;
            case 7:
                C4017e c4017e2 = (C4017e) obj;
                c4017e2.ad();
                List startapp2 = AbstractC6874e.startapp(new C3618e(C3618e.startapp), new C3618e(j));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r0.f28537e.m4560try() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                C18478e c18478e2 = c4017e2.f8940e.f28537e;
                AbstractC4653e.admob(c4017e2, new C11078e(startapp2, null, floatToRawIntBits2, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18478e2.m4560try() >> 32)) / 2.0f) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18478e2.m4560try() & 4294967295L)))), 0), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 8:
                C4017e c4017e3 = (C4017e) obj;
                c4017e3.ad();
                List startapp3 = AbstractC6874e.startapp(new C3618e(C3618e.vip(0.2f, j)), new C3618e(j));
                long floatToRawIntBits3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r0.f28537e.m4560try() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                C18478e c18478e3 = c4017e3.f8940e.f28537e;
                AbstractC4653e.admob(c4017e3, new C11078e(startapp3, null, floatToRawIntBits3, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18478e3.m4560try() >> 32)) / 2.0f) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18478e3.m4560try() & 4294967295L)))), 0), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 9:
                ((Float) obj).getClass();
                return new C18466e(j);
            case 10:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float mo497instanceof = interfaceC2235e.mo497instanceof(16 + 32);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(mo497instanceof) << 32) | (4294967295L & Float.floatToRawIntBits(mo497instanceof));
                long j2 = this.f27947e;
                long vip = C3618e.vip(0.5f, j2);
                long vip2 = C3618e.vip(0.25f, j2);
                AbstractC4653e.subscription(interfaceC2235e, C3618e.vip(0.1f, j2), 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC4653e.mopub(interfaceC2235e, vip2, C2108e.license(interfaceC2235e.yandex()), floatToRawIntBits4, null, 120);
                AbstractC4653e.mopub(interfaceC2235e, vip, C2108e.license(interfaceC2235e.yandex()) / 2.0f, floatToRawIntBits4, null, 120);
                AbstractC4653e.mopub(interfaceC2235e, j2, C2108e.license(interfaceC2235e.yandex()) / 5.0f, floatToRawIntBits4, null, 120);
                return Unit.INSTANCE;
            default:
                C5114e c5114e = (C5114e) obj;
                c5114e.m1759e(c5114e.m1758e(AbstractC3820e.ad.vip(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)).metrica());
                return Boolean.TRUE;
        }
    }
}
