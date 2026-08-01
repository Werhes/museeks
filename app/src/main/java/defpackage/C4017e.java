package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4017e implements InterfaceC2235e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC8501e f8939e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14434e f8940e = new C14434e();

    @Override // defpackage.InterfaceC2235e
    /* renamed from: abstract */
    public final void mo775abstract(long j, float f, long j2, AbstractC4970e abstractC4970e) {
        this.f8940e.mo775abstract(j, f, j2, abstractC4970e);
    }

    public final void ad() {
        C14434e c14434e = this.f8940e;
        InterfaceC14576e m4557this = c14434e.f28537e.m4557this();
        InterfaceC5077e interfaceC5077e = this.f8939e;
        if (interfaceC5077e == null) {
            throw AbstractC8703e.Signature("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC13616e abstractC13616e = (AbstractC13616e) interfaceC5077e;
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e.f27024e;
        if (abstractC13616e2 != null && (abstractC13616e2.f27020e & 4) != 0) {
            while (abstractC13616e2 != null) {
                int i = abstractC13616e2.f27014e;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    abstractC13616e2 = abstractC13616e2.f27024e;
                }
            }
        }
        abstractC13616e2 = null;
        if (abstractC13616e2 == null) {
            AbstractC17732e yandex = AbstractC5851e.yandex(interfaceC5077e, 4);
            if (yandex.mo2524e() == abstractC13616e.f27022e) {
                yandex = yandex.f34777e;
            }
            yandex.mo2522e(m4557this, (C16446e) c14434e.f28537e.f36227e);
            return;
        }
        C12431e c12431e = null;
        while (abstractC13616e2 != null) {
            if (abstractC13616e2 instanceof InterfaceC8501e) {
                InterfaceC8501e interfaceC8501e = (InterfaceC8501e) abstractC13616e2;
                C16446e c16446e = (C16446e) c14434e.f28537e.f36227e;
                AbstractC17732e yandex2 = AbstractC5851e.yandex(interfaceC8501e, 4);
                long startapp = AbstractC8116e.startapp(yandex2.f6803e);
                C13915e c13915e = yandex2.f34782e;
                c13915e.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getSharedDrawScope().metrica(m4557this, startapp, yandex2, interfaceC8501e, c16446e);
            } else if ((abstractC13616e2.f27014e & 4) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                int i2 = 0;
                for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                    if ((abstractC13616e3.f27014e & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            abstractC13616e2 = abstractC13616e3;
                        } else {
                            if (c12431e == null) {
                                c12431e = new C12431e(0, new AbstractC13616e[16]);
                            }
                            if (abstractC13616e2 != null) {
                                c12431e.license(abstractC13616e2);
                                abstractC13616e2 = null;
                            }
                            c12431e.license(abstractC13616e3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            abstractC13616e2 = AbstractC5851e.vip(c12431e);
        }
    }

    @Override // defpackage.InterfaceC2235e
    public final void applovin(C1362e c1362e, long j, float f, C2815e c2815e, int i) {
        this.f8940e.applovin(c1362e, j, f, c2815e, i);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return this.f8940e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return this.f8940e.mo492default(f);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: extends */
    public final void mo776extends(long j, long j2, long j3, float f, int i) {
        this.f8940e.mo776extends(j, j2, j3, f, i);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eؑۥؘ */
    public final void mo777e(C1362e c1362e, long j, long j2, long j3, float f, C2815e c2815e, int i) {
        this.f8940e.mo777e(c1362e, j, j2, j3, f, c2815e, i);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eؒۤۨ */
    public final void mo778e(ArrayList arrayList, long j, float f) {
        this.f8940e.mo778e(arrayList, j, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final int mo493e(float f) {
        C14434e c14434e = this.f8940e;
        c14434e.getClass();
        return AbstractC4653e.ad(c14434e, f);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eٌؖۡ */
    public final long mo779e() {
        return this.f8940e.mo779e();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final long mo494e(long j) {
        C14434e c14434e = this.f8940e;
        c14434e.getClass();
        return AbstractC4653e.appmetrica(j, c14434e);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eَٖٓ */
    public final void mo780e(AbstractC4457e abstractC4457e, long j, long j2, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        this.f8940e.mo780e(abstractC4457e, j, j2, f, abstractC4970e, c2815e, i);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final float mo495e(long j) {
        C14434e c14434e = this.f8940e;
        c14434e.getClass();
        return AbstractC4653e.license(j, c14434e);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eٟٗۦ */
    public final void mo781e(long j, long j2, long j3, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        this.f8940e.mo781e(j, j2, j3, f, abstractC4970e, c2815e, i);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return this.f8940e.mo496final(i);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: finally */
    public final C18478e mo782finally() {
        return this.f8940e.f28537e;
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        C14434e c14434e = this.f8940e;
        c14434e.getClass();
        return AbstractC4653e.vip(j, c14434e);
    }

    @Override // defpackage.InterfaceC2235e
    public final EnumC7792e getLayoutDirection() {
        return this.f8940e.f28539e.vip;
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: import */
    public final void mo783import(long j, long j2, long j3, long j4, AbstractC4970e abstractC4970e) {
        this.f8940e.mo783import(j, j2, j3, j4, abstractC4970e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return this.f8940e.vip() * f;
    }

    public final void metrica(InterfaceC14576e interfaceC14576e, long j, AbstractC17732e abstractC17732e, InterfaceC8501e interfaceC8501e, C16446e c16446e) {
        InterfaceC8501e interfaceC8501e2 = this.f8939e;
        this.f8939e = interfaceC8501e;
        EnumC7792e enumC7792e = abstractC17732e.f34782e.f27610e;
        C14434e c14434e = this.f8940e;
        InterfaceC14388e m4534extends = c14434e.f28537e.m4534extends();
        C18478e c18478e = c14434e.f28537e;
        EnumC7792e m4562while = c18478e.m4562while();
        InterfaceC14576e m4557this = c18478e.m4557this();
        long m4560try = c18478e.m4560try();
        C16446e c16446e2 = (C16446e) c18478e.f36227e;
        c18478e.m4532const(abstractC17732e);
        c18478e.m4542for(enumC7792e);
        c18478e.m4541finally(interfaceC14576e);
        c18478e.m4533continue(j);
        c18478e.f36227e = c16446e;
        interfaceC14576e.billing();
        try {
            interfaceC8501e.mo294e(this);
            interfaceC14576e.admob();
            c18478e.m4532const(m4534extends);
            c18478e.m4542for(m4562while);
            c18478e.m4541finally(m4557this);
            c18478e.m4533continue(m4560try);
            c18478e.f36227e = c16446e2;
            this.f8939e = interfaceC8501e2;
        } catch (Throwable th) {
            interfaceC14576e.admob();
            c18478e.m4532const(m4534extends);
            c18478e.m4542for(m4562while);
            c18478e.m4541finally(m4557this);
            c18478e.m4533continue(m4560try);
            c18478e.f36227e = c16446e2;
            throw th;
        }
    }

    @Override // defpackage.InterfaceC2235e
    public final void mopub(C17985e c17985e, long j, float f, AbstractC4970e abstractC4970e) {
        this.f8940e.mopub(c17985e, j, f, abstractC4970e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / this.f8940e.vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f8940e.mo499package();
    }

    @Override // defpackage.InterfaceC2235e
    public final void remoteconfig(long j, C16446e c16446e, Function1 function1) {
        c16446e.appmetrica(this, getLayoutDirection(), j, new C7314e(8, this, this.f8939e, function1));
    }

    @Override // defpackage.InterfaceC2235e
    public final void subs(long j, float f, float f2, long j2, long j3, float f3, AbstractC4970e abstractC4970e) {
        this.f8940e.subs(j, f, f2, j2, j3, f3, abstractC4970e);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: synchronized */
    public final void mo784synchronized(C17985e c17985e, AbstractC4457e abstractC4457e, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        this.f8940e.mo784synchronized(c17985e, abstractC4457e, f, abstractC4970e, c2815e, i);
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        C14434e c14434e = this.f8940e;
        c14434e.getClass();
        return AbstractC4653e.metrica(j, c14434e);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: throws */
    public final void mo785throws(AbstractC4457e abstractC4457e, long j, long j2, long j3, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        this.f8940e.mo785throws(abstractC4457e, j, j2, j3, f, abstractC4970e, c2815e, i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f8940e.vip();
    }

    @Override // defpackage.InterfaceC2235e
    public final long yandex() {
        return this.f8940e.f28537e.m4560try();
    }
}
