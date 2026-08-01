package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۡۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4435e extends AbstractC13113e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C4435e f9618e = new C4435e();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient Object[] f9619e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient C4435e f9620e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object f9621e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f9622e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f9623e;

    public C4435e() {
        this.f9621e = null;
        this.f9619e = new Object[0];
        this.f9623e = 0;
        this.f9622e = 0;
        this.f9620e = this;
    }

    public C4435e(int i, Object[] objArr) {
        this.f9619e = objArr;
        this.f9622e = i;
        this.f9623e = 0;
        int loadAd = i >= 2 ? AbstractC12614e.loadAd(i) : 0;
        Object startapp = C0409e.startapp(objArr, i, loadAd, 0);
        if (startapp instanceof Object[]) {
            throw ((C14170e) ((Object[]) startapp)[2]).ad();
        }
        this.f9621e = startapp;
        Object startapp2 = C0409e.startapp(objArr, i, loadAd, 1);
        if (startapp2 instanceof Object[]) {
            throw ((C14170e) ((Object[]) startapp2)[2]).ad();
        }
        this.f9620e = new C4435e(startapp2, objArr, i, this);
    }

    public C4435e(Object obj, Object[] objArr, int i, C4435e c4435e) {
        this.f9621e = obj;
        this.f9619e = objArr;
        this.f9623e = 1;
        this.f9622e = i;
        this.f9620e = c4435e;
    }

    @Override // defpackage.AbstractC8507e, java.util.Map
    public final Object get(Object obj) {
        Object adcel = C0409e.adcel(this.f9621e, this.f9619e, this.f9622e, this.f9623e, obj);
        if (adcel == null) {
            return null;
        }
        return adcel;
    }

    @Override // defpackage.AbstractC8507e
    public final C2520e license() {
        return new C2520e(this, new C7816e(this.f9623e, this.f9622e, this.f9619e));
    }

    @Override // defpackage.AbstractC8507e
    public final C5239e metrica() {
        return new C5239e(this, this.f9619e, this.f9623e, this.f9622e);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9622e;
    }
}
