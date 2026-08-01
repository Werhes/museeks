package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٝٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16372e implements InterfaceC14309e, InterfaceC17847e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16372e f32165e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C16372e f32166e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C16372e f32167e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f32168e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32169e;

    static {
        int i = 0;
        f32166e = new C16372e("TINK", i);
        f32167e = new C16372e("CRUNCHY", i);
        f32165e = new C16372e("NO_PREFIX", i);
    }

    public /* synthetic */ C16372e(String str, int i) {
        this.f32169e = i;
        this.f32168e = str;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        int i = C3355e.mopub;
        BinderC15538e binderC15538e = new BinderC15538e((C8988e) obj2);
        C18117e c18117e = (C18117e) ((C1540e) obj).loadAd();
        Parcel m4156e = c18117e.m4156e();
        AbstractC1757e.metrica(m4156e, binderC15538e);
        m4156e.writeString(this.f32168e);
        c18117e.m4155e(m4156e, 5);
    }

    @Override // defpackage.InterfaceC14309e
    public /* bridge */ /* synthetic */ void license(Object obj) {
    }

    public String toString() {
        switch (this.f32169e) {
            case 0:
                return this.f32168e;
            case 1:
            default:
                return super.toString();
            case 2:
                return this.f32168e;
        }
    }

    @Override // defpackage.InterfaceC14309e
    public void yandex(Throwable th) {
        AbstractC2803e.amazon("MediaNtfMng", "custom command " + this.f32168e + " produced an error: " + th.getMessage(), th);
    }
}
