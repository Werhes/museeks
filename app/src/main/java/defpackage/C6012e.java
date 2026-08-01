package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6012e extends AbstractC1186e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function0 f12660e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC11542e f12661e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0394e f12662e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑٚ, eٖۥٌ] */
    public C6012e(InterfaceC11542e interfaceC11542e, Function0 function0) {
        this.f12661e = interfaceC11542e;
        this.f12660e = function0;
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.f12662e = new C16622e(c6272e, function0);
    }

    @Override // defpackage.AbstractC1186e
    public final boolean Signature() {
        return pro().Signature();
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new C6012e(this.f12661e, new C1021e(c13520e, this, 2));
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo483e() {
        return pro().mo483e();
    }

    @Override // defpackage.AbstractC1186e
    public final InterfaceC5021e loadAd() {
        return pro().loadAd();
    }

    @Override // defpackage.AbstractC1186e
    public final List mopub() {
        return pro().mopub();
    }

    public final AbstractC1186e pro() {
        return (AbstractC1186e) this.f12662e.invoke();
    }

    @Override // defpackage.AbstractC1186e
    public final C6557e smaato() {
        return pro().smaato();
    }

    @Override // defpackage.AbstractC1186e
    public final AbstractC15728e subscription() {
        AbstractC1186e pro = pro();
        while (pro instanceof C6012e) {
            pro = ((C6012e) pro).pro();
        }
        return (AbstractC15728e) pro;
    }

    public final String toString() {
        C0394e c0394e = this.f12662e;
        return (c0394e.f32571e == EnumC8150e.f16547e || c0394e.f32571e == EnumC8150e.f16545e) ? "<Not computed yet>" : pro().toString();
    }
}
