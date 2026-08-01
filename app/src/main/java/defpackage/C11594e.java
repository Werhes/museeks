package defpackage;

import android.os.Parcel;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11594e implements InterfaceC17847e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C11594e f23291e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C11594e f23292e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C11594e f23293e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f23294e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23295e;

    static {
        int i = 0;
        f23292e = new C11594e("TINK", i);
        f23293e = new C11594e("CRUNCHY", i);
        f23291e = new C11594e("NO_PREFIX", i);
    }

    public /* synthetic */ C11594e(String str, int i) {
        this.f23295e = i;
        this.f23294e = str;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        int i = C3355e.mopub;
        BinderC15538e binderC15538e = new BinderC15538e((C8988e) obj2);
        C18117e c18117e = (C18117e) ((C1540e) obj).loadAd();
        Parcel m4156e = c18117e.m4156e();
        AbstractC1757e.metrica(m4156e, binderC15538e);
        m4156e.writeString(this.f23294e);
        m4156e.writeString(BuildConfig.FLAVOR);
        m4156e.writeString(null);
        c18117e.m4155e(m4156e, 11);
    }

    public String toString() {
        switch (this.f23295e) {
            case 0:
                return this.f23294e;
            default:
                return super.toString();
        }
    }
}
