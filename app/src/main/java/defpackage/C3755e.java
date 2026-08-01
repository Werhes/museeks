package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3755e extends AbstractC13616e implements InterfaceC17303e, InterfaceC8501e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public InterfaceC2872e f8344e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC8079e f8345e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public AbstractC10727e f8346e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f8347e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public float f8348e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C2815e f8349e;

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public static boolean m1398e(long j) {
        return !C2108e.vip(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public static boolean m1399e(long j) {
        return !C2108e.vip(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (!m1400e()) {
            return interfaceC16719e.loadAd(i);
        }
        long m1401e = m1401e(AbstractC2278e.vip(0, 0, 0, i, 7));
        return Math.max(C5602e.adcel(m1401e), interfaceC16719e.loadAd(i));
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (!m1400e()) {
            return interfaceC16719e.mo2529while(i);
        }
        long m1401e = m1401e(AbstractC2278e.vip(0, i, 0, 0, 13));
        return Math.max(C5602e.startapp(m1401e), interfaceC16719e.mo2529while(i));
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        long startapp = this.f8346e.startapp();
        long floatToRawIntBits = (Float.floatToRawIntBits(m1399e(startapp) ? Float.intBitsToFloat((int) (startapp >> 32)) : Float.intBitsToFloat((int) (c4017e.f8940e.f28537e.m4560try() >> 32))) << 32) | (Float.floatToRawIntBits(m1398e(startapp) ? Float.intBitsToFloat((int) (startapp & 4294967295L)) : Float.intBitsToFloat((int) (c4017e.f8940e.f28537e.m4560try() & 4294967295L))) & 4294967295L);
        C14434e c14434e = c4017e.f8940e;
        long appmetrica = (Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() & 4294967295L)) == 0.0f) ? 0L : AbstractC0258e.appmetrica(floatToRawIntBits, this.f8344e.yandex(floatToRawIntBits, c14434e.f28537e.m4560try()));
        long ad = this.f8345e.ad((Math.round(Float.intBitsToFloat((int) (appmetrica >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (appmetrica & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() & 4294967295L))) & 4294967295L), c4017e.getLayoutDirection());
        float f = (int) (ad >> 32);
        float f2 = (int) (ad & 4294967295L);
        ((C5389e) c14434e.f28537e.f36228e).m1898this(f, f2);
        try {
            this.f8346e.billing(c4017e, appmetrica, this.f8348e, this.f8349e);
            ((C5389e) c14434e.f28537e.f36228e).m1898this(-f, -f2);
            c4017e.ad();
        } catch (Throwable th) {
            ((C5389e) c14434e.f28537e.f36228e).m1898this(-f, -f2);
            throw th;
        }
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final boolean m1400e() {
        return this.f8347e && this.f8346e.startapp() != 9205357640488583168L;
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final long m1401e(long j) {
        boolean z = false;
        boolean z2 = C5602e.license(j) && C5602e.metrica(j);
        if (C5602e.purchase(j) && C5602e.appmetrica(j)) {
            z = true;
        }
        if ((!m1400e() && z2) || z) {
            return C5602e.ad(C5602e.yandex(j), 0, C5602e.billing(j), 0, 10, j);
        }
        long startapp = this.f8346e.startapp();
        int round = m1399e(startapp) ? Math.round(Float.intBitsToFloat((int) (startapp >> 32))) : C5602e.adcel(j);
        int round2 = m1398e(startapp) ? Math.round(Float.intBitsToFloat((int) (startapp & 4294967295L))) : C5602e.startapp(j);
        int billing = AbstractC2278e.billing(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(AbstractC2278e.purchase(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(billing) << 32);
        if (m1400e()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!m1399e(this.f8346e.startapp()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f8346e.startapp() >> 32))) << 32) | (Float.floatToRawIntBits(!m1398e(this.f8346e.startapp()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f8346e.startapp() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC0258e.appmetrica(floatToRawIntBits2, this.f8344e.yandex(floatToRawIntBits2, floatToRawIntBits));
        }
        return C5602e.ad(AbstractC2278e.billing(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, AbstractC2278e.purchase(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(m1401e(j));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C8684e(admob, 5));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (!m1400e()) {
            return interfaceC16719e.metrica(i);
        }
        long m1401e = m1401e(AbstractC2278e.vip(0, i, 0, 0, 13));
        return Math.max(C5602e.startapp(m1401e), interfaceC16719e.metrica(i));
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (!m1400e()) {
            return interfaceC16719e.smaato(i);
        }
        long m1401e = m1401e(AbstractC2278e.vip(0, 0, 0, i, 7));
        return Math.max(C5602e.adcel(m1401e), interfaceC16719e.smaato(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f8346e + ", sizeToIntrinsics=" + this.f8347e + ", alignment=" + this.f8345e + ", alpha=" + this.f8348e + ", colorFilter=" + this.f8349e + ')';
    }
}
