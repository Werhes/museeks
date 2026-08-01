package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4625e implements InterfaceC3665e, InterfaceC6174e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f9959e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f9960e;

    public /* synthetic */ C4625e(String str, String str2) {
        this.f9960e = str;
        this.f9959e = str2;
    }

    @Override // defpackage.InterfaceC3665e
    public InterfaceC1108e amazon() {
        InterfaceC1108e signatures;
        C4199e m4502e = C18353e.vip.m4502e();
        return (m4502e == null || (signatures = AbstractC0054e.signatures(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "albumFullId == $0", Arrays.copyOf(new Object[]{this.f9960e}, 1)).vip("title", "subtitle"))) == null) ? new C10250e(4, C10327e.f20377e) : new C5786e(signatures, 13);
    }

    @Override // defpackage.InterfaceC3665e
    public C6571e appmetrica() {
        List m1869private = AbstractC5304e.m1869private(this.f9960e, new String[]{"_"}, 6);
        String str = (String) AbstractC13480e.m3592native(1, m1869private);
        if (str == null) {
            return null;
        }
        int parseInt = Integer.parseInt(str);
        String str2 = (String) AbstractC13480e.m3592native(0, m1869private);
        if (str2 == null) {
            return null;
        }
        return new C6571e(Integer.valueOf(parseInt), Long.valueOf(Long.parseLong(str2)));
    }

    @Override // defpackage.InterfaceC3665e
    public String billing(Context context) {
        return this.f9959e;
    }

    @Override // defpackage.InterfaceC6174e
    public C5471e toInstant() {
        throw new IllegalArgumentException(this.f9960e + " when parsing an Instant from \"" + AbstractC12501e.smaato(64, this.f9959e) + '\"');
    }

    @Override // defpackage.InterfaceC3665e
    public Object yandex(C15238e c15238e) {
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C16373e(this.f9960e, null, 8), c15238e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (advert != enumC2821e) {
            advert = Unit.INSTANCE;
        }
        return advert == enumC2821e ? advert : Unit.INSTANCE;
    }
}
