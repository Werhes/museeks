package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18106e implements InterfaceC1108e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f35496e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Charset f35497e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1622e f35498e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C12025e f35499e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C10250e f35500e;

    public C18106e(C10250e c10250e, C1622e c1622e, Charset charset, C12025e c12025e, Object obj) {
        this.f35500e = c10250e;
        this.f35498e = c1622e;
        this.f35497e = charset;
        this.f35499e = c12025e;
        this.f35496e = obj;
    }

    @Override // defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        Object ad = this.f35500e.ad(new C14622e(interfaceC6034e, this.f35498e, this.f35497e, this.f35499e, this.f35496e), interfaceC5083e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }
}
