package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۧ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11409e extends AbstractC6126e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public float f22943e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public long f22944e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public long f22945e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C7558e f22946e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C8419e f22947e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C8419e f22948e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public float f22949e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C13121e f22951e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public float f22952e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C13121e f22954e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C2616e f22953e = new C2616e(0.0f);

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C15781e f22950e = new C15781e();

    public AbstractC11409e(long j, long j2, C13121e c13121e, C13121e c13121e2, float f, float f2, float f3) {
        this.f22945e = j;
        this.f22944e = j2;
        this.f22951e = c13121e;
        this.f22954e = c13121e2;
        this.f22943e = f;
        this.f22949e = f2;
        this.f22952e = f3;
    }

    /* renamed from: eؚٜ۠ */
    public abstract void mo1473e();

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f22946e = null;
    }

    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final void m3204e(float f) {
        C7558e c7558e = this.f22946e;
        if (c7558e == null) {
            c7558e = AbstractC7111e.ad(f);
            this.f22946e = c7558e;
        }
        if (!this.f27016e || ((Number) c7558e.appmetrica.getValue()).floatValue() == f) {
            return;
        }
        C8419e c8419e = this.f22947e;
        if (c8419e == null || c8419e.mo693e()) {
            this.f22947e = AbstractC5336e.purchase(m3623e(), null, 0, new C6152e(c7558e, f, null, 0), 3);
        }
    }

    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final void m3205e() {
        C8419e c8419e = this.f22948e;
        InterfaceC5083e interfaceC5083e = null;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.f22948e = null;
        if (this.f27016e) {
            float f = 0;
            if (C15765e.ad(this.f22952e, f) <= 0 || C15765e.ad(this.f22949e, f) <= 0) {
                this.f22953e.startapp(0.0f);
                return;
            }
            int round = Math.round((this.f22949e / this.f22952e) * 1000);
            if (round < 50) {
                round = 50;
            }
            this.f22948e = AbstractC5336e.purchase(m3623e(), null, 0, new C11143e(this, round, interfaceC5083e, 0), 3);
        }
    }

    /* renamed from: eٖٔۧ */
    public abstract void mo1475e();

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        m3205e();
    }
}
