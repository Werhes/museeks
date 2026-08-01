package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6620e implements InterfaceC1108e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13033e f13649e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Charset f13650e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10250e f13651e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C12025e f13652e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13653e;

    public /* synthetic */ C6620e(C10250e c10250e, Charset charset, C12025e c12025e, InterfaceC13033e interfaceC13033e, int i) {
        this.f13653e = i;
        this.f13651e = c10250e;
        this.f13650e = charset;
        this.f13652e = c12025e;
        this.f13649e = interfaceC13033e;
    }

    @Override // defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        switch (this.f13653e) {
            case 0:
                Object ad = this.f13651e.ad(new C6509e(interfaceC6034e, this.f13650e, this.f13652e, this.f13649e, 0), interfaceC5083e);
                return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
            default:
                Object ad2 = this.f13651e.ad(new C6509e(interfaceC6034e, this.f13650e, this.f13652e, this.f13649e, 1), interfaceC5083e);
                return ad2 == EnumC2821e.f6782e ? ad2 : Unit.INSTANCE;
        }
    }
}
