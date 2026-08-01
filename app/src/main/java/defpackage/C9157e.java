package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9157e extends AbstractC17732e {

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public static final C11447e f18319e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public C10429e f18320e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public C5602e f18321e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public InterfaceC17303e f18322e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public C11277e f18323e;

    static {
        C11447e vip = AbstractC17331e.vip();
        vip.appmetrica(C3618e.billing);
        vip.advert(1.0f);
        vip.smaato(1);
        f18319e = vip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9157e(C13915e c13915e, InterfaceC17303e interfaceC17303e) {
        super(c13915e);
        this.f18322e = interfaceC17303e;
        this.f18320e = c13915e.f27587e != null ? new C10429e(this) : null;
        this.f18323e = (((AbstractC13616e) interfaceC17303e).f27022e.f27014e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? new C11277e(this, (C0404e) interfaceC17303e) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // defpackage.InterfaceC16719e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC2832e admob(long r8) {
        /*
            r7 = this;
            boolean r0 = r7.f34781e
            if (r0 == 0) goto L13
            eؘّٛ r8 = r7.f18321e
            if (r8 == 0) goto Lb
            long r8 = r8.ad
            goto L13
        Lb:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Lookahead constraints cannot be null in approach pass."
            r8.<init>(r9)
            throw r8
        L13:
            r7.m1210strictfp(r8)
            eُۛۧ r0 = r7.f18323e
            if (r0 == 0) goto Lb0
            eؑٚۢ r1 = r0.f22655e
            eٍؘؐ r2 = r0.f22656e
            eَٟؕ r2 = r2.f18320e
            eٗۚ r2 = r2.mo1469e()
            r2.getWidth()
            r2.vip()
            eٖٕؗ r2 = r1.f2444e
            boolean r2 = r2.yandex()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4f
            eٖٕؗ r2 = r1.f2444e
            eؚۥِ r2 = r2.appmetrica()
            boolean r2 = r2.ad()
            if (r2 == 0) goto L4f
            eٖٕؗ r2 = r1.f2444e
            eؚۥِ r2 = r2.appmetrica()
            eْۤ٘ r2 = r2.vip
            boolean r2 = r2.vip()
            if (r2 == 0) goto L4f
            goto L5e
        L4f:
            eؘّٛ r2 = r7.f18321e
            boolean r5 = defpackage.AbstractC0869e.premium(r2)
            if (r5 != 0) goto L58
            goto L5e
        L58:
            long r5 = r2.ad
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L60
        L5e:
            r2 = r4
            goto L61
        L60:
            r2 = r3
        L61:
            r0.f22654e = r2
            if (r2 != 0) goto L69
            eْ٘ۧ r2 = r7.f34777e
            r2.f34781e = r4
        L69:
            eْ٘ۧ r2 = r7.f34777e
            eٗۚ r8 = r1.m341e(r0, r2, r8)
            eْ٘ۧ r9 = r7.f34777e
            r9.f34781e = r3
            int r9 = r8.getWidth()
            eَٟؕ r1 = r7.f18320e
            int r1 = r1.f6806e
            if (r9 != r1) goto L88
            int r9 = r8.vip()
            eَٟؕ r1 = r7.f18320e
            int r1 = r1.f6804e
            if (r9 != r1) goto L88
            r3 = r4
        L88:
            boolean r9 = r0.f22654e
            if (r9 != 0) goto Lb8
            eْ٘ۧ r9 = r7.f34777e
            long r0 = r9.f6803e
            eٖؖؓ r9 = r9.mo2526e()
            if (r9 == 0) goto La0
            long r4 = r9.m1465e()
            eٌّۚ r9 = new eٌّۚ
            r9.<init>(r4)
            goto La1
        La0:
            r9 = 0
        La1:
            boolean r9 = defpackage.C12729e.ad(r0, r9)
            if (r9 == 0) goto Lb8
            if (r3 != 0) goto Lb8
            eؗؖٛ r9 = new eؗؖٛ
            r9.<init>(r8, r7)
            r8 = r9
            goto Lb8
        Lb0:
            eؘٗ۠ r0 = r7.f18322e
            eْ٘ۧ r1 = r7.f34777e
            eٗۚ r8 = r0.license(r7, r1, r8)
        Lb8:
            r7.m4418e(r8)
            r7.m4407e()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9157e.admob(long):eؔۚؓ");
    }

    @Override // defpackage.AbstractC17732e, defpackage.AbstractC2832e
    /* renamed from: case */
    public final void mo1207case(long j, float f, C16446e c16446e) {
        if (this.f34784e) {
            m4397e(mo2526e().f9110e, f, null, c16446e);
        } else {
            m4397e(j, f, null, c16446e);
        }
        m2525e();
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: catch */
    public final void mo392catch(long j, float f, Function1 function1) {
        if (this.f34784e) {
            m4397e(mo2526e().f9110e, f, function1, null);
        } else {
            m4397e(j, f, function1, null);
        }
        m2525e();
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: eِؕٛ, reason: contains not printable characters */
    public final void mo2522e(InterfaceC14576e interfaceC14576e, C16446e c16446e) {
        AbstractC17732e abstractC17732e;
        this.f34777e.m4414e(interfaceC14576e, c16446e);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(this.f34782e)).getShowLayoutBounds() || (abstractC17732e = this.f34777e) == null) {
            return;
        }
        if (C12729e.vip(this.f6803e, abstractC17732e.f6803e) && C11490e.vip(abstractC17732e.f34793e, 0L)) {
            return;
        }
        long j = this.f6803e;
        interfaceC14576e.mopub(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f18319e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: eؙۛ۠, reason: contains not printable characters */
    public final void m2523e(InterfaceC17303e interfaceC17303e) {
        if (!interfaceC17303e.equals(this.f18322e)) {
            if ((((AbstractC13616e) interfaceC17303e).f27022e.f27014e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                C0404e c0404e = (C0404e) interfaceC17303e;
                C11277e c11277e = this.f18323e;
                if (c11277e != null) {
                    c11277e.f22655e = c0404e;
                } else {
                    c11277e = new C11277e(this, c0404e);
                }
                this.f18323e = c11277e;
            } else {
                this.f18323e = null;
            }
        }
        this.f18322e = interfaceC17303e;
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public final AbstractC13616e mo2524e() {
        return ((AbstractC13616e) this.f18322e).f27022e;
    }

    /* renamed from: eٍٟٔ, reason: contains not printable characters */
    public final void m2525e() {
        boolean z;
        if (this.f18511e) {
            return;
        }
        m4415e();
        AbstractC17732e abstractC17732e = this.f34777e;
        C11277e c11277e = this.f18323e;
        if (c11277e != null) {
            C10429e c10429e = this.f18320e;
            C13221e c13221e = c10429e.f9107e;
            if (!c11277e.f22654e) {
                if (C12729e.ad(this.f6803e, c10429e != null ? new C12729e(c10429e.m1465e()) : null)) {
                    long j = abstractC17732e.f6803e;
                    AbstractC4134e mo2526e = abstractC17732e.mo2526e();
                    if (C12729e.ad(j, mo2526e != null ? new C12729e(mo2526e.m1465e()) : null)) {
                        z = true;
                        abstractC17732e.f34784e = z;
                    }
                }
            }
            z = false;
            abstractC17732e.f34784e = z;
        }
        abstractC17732e.f18514e = this.f18514e;
        mo1469e().metrica();
        abstractC17732e.f18514e = false;
        abstractC17732e.f34784e = false;
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public final AbstractC4134e mo2526e() {
        return this.f18320e;
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public final void mo2527e() {
        if (this.f18320e == null) {
            this.f18320e = new C10429e(this);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        C11277e c11277e = this.f18323e;
        if (c11277e == null) {
            return this.f18322e.ad(this, this.f34777e, i);
        }
        C0404e c0404e = c11277e.f22655e;
        AbstractC17732e abstractC17732e = this.f34777e;
        if (!c0404e.f27022e.f27018e.mo2526e().mo1470for()) {
            return abstractC17732e.loadAd(i);
        }
        return c0404e.m341e(new C13013e(c11277e, c11277e.getLayoutDirection()), new C11976e(abstractC17732e, 2, 1, 2), AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        C11277e c11277e = this.f18323e;
        if (c11277e == null) {
            return this.f18322e.purchase(this, this.f34777e, i);
        }
        C0404e c0404e = c11277e.f22655e;
        AbstractC17732e abstractC17732e = this.f34777e;
        if (!c0404e.f27022e.f27018e.mo2526e().mo1470for()) {
            return abstractC17732e.metrica(i);
        }
        return c0404e.m341e(new C13013e(c11277e, c11277e.getLayoutDirection()), new C11976e(abstractC17732e, 2, 2, 2), AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        C11277e c11277e = this.f18323e;
        if (c11277e == null) {
            return this.f18322e.startapp(this, this.f34777e, i);
        }
        C0404e c0404e = c11277e.f22655e;
        AbstractC17732e abstractC17732e = this.f34777e;
        if (!c0404e.f27022e.f27018e.mo2526e().mo1470for()) {
            return abstractC17732e.smaato(i);
        }
        return c0404e.m341e(new C13013e(c11277e, c11277e.getLayoutDirection()), new C11976e(abstractC17732e, 1, 1, 2), AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: static, reason: not valid java name */
    public final int mo2528static(AbstractC17016e abstractC17016e) {
        C10429e c10429e = this.f18320e;
        if (c10429e == null) {
            return AbstractC5546e.ad(this, abstractC17016e);
        }
        C17866e c17866e = c10429e.f9112e;
        int license = c17866e.license(abstractC17016e);
        return license >= 0 ? c17866e.metrica[license] : RecyclerView.UNDEFINED_DURATION;
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while, reason: not valid java name */
    public final int mo2529while(int i) {
        C11277e c11277e = this.f18323e;
        if (c11277e == null) {
            return this.f18322e.billing(this, this.f34777e, i);
        }
        C0404e c0404e = c11277e.f22655e;
        AbstractC17732e abstractC17732e = this.f34777e;
        if (!c0404e.f27022e.f27018e.mo2526e().mo1470for()) {
            return abstractC17732e.mo2529while(i);
        }
        return c0404e.m341e(new C13013e(c11277e, c11277e.getLayoutDirection()), new C11976e(abstractC17732e, 1, 2, 2), AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }
}
