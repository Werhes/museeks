package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14478e extends AbstractC13616e implements InterfaceC17303e, InterfaceC8501e, InterfaceC13046e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C16446e f28607e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f28610e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f28611e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C6656e f28612e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f28613e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C8419e f28617e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C16330e f28609e = new C16330e(0);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C16330e f28608e = new C16330e(0);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f28614e = AbstractC14533e.startapp(Boolean.FALSE);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f28615e = AbstractC14533e.startapp(new Object());

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C7558e f28616e = AbstractC7111e.ad(0.0f);

    public C14478e(int i, C13415e c13415e, float f) {
        this.f28610e = i;
        this.f28611e = f;
        this.f28613e = AbstractC14533e.startapp(c13415e);
        this.f28612e = AbstractC14533e.purchase(new C1708e(c13415e, this, 6));
    }

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16719e.loadAd(i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16719e.mo2529while(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void m3806e() {
        C8419e c8419e = this.f28617e;
        InterfaceC5083e interfaceC5083e = null;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        if (this.f27016e) {
            this.f28617e = AbstractC5336e.purchase(m3623e(), null, 0, new C17806e(c8419e, this, interfaceC5083e, 16), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009f  */
    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo294e(defpackage.C4017e r20) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14478e.mo294e(eَؖؓ):void");
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        C8419e c8419e = this.f28617e;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.f28617e = null;
        C16446e c16446e = this.f28607e;
        if (c16446e != null) {
            AbstractC5851e.startapp(this).ad(c16446e);
            this.f28607e = null;
        }
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final int m3807e() {
        return ((Number) this.f28612e.getValue()).intValue();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        C16446e c16446e = this.f28607e;
        InterfaceC2661e startapp = AbstractC5851e.startapp(this);
        if (c16446e != null) {
            startapp.ad(c16446e);
        }
        this.f28607e = startapp.metrica();
        m3806e();
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13, j));
        int billing = AbstractC2278e.billing(admob.f6806e, j);
        C16330e c16330e = this.f28608e;
        c16330e.startapp(billing);
        this.f28609e.startapp(admob.f6806e);
        return interfaceC13158e.ads(c16330e.purchase(), admob.f6804e, C9139e.f18290e, new C4889e(admob, 9));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16719e.metrica(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return 0;
    }

    @Override // defpackage.InterfaceC13046e
    /* renamed from: throw */
    public final void mo1035throw(EnumC16488e enumC16488e) {
        this.f28614e.setValue(Boolean.valueOf(enumC16488e.ad()));
    }
}
