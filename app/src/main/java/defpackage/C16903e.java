package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16903e implements InterfaceC14343e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final InterfaceC6823e f33119e = AbstractC5209e.billing(new C8456e(0));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f33120e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17424e f33121e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f33122e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceExecutorServiceC13317e f33123e;

    public C16903e(crashlytics crashlyticsVar) {
        this.f33121e = new C17424e((Context) crashlyticsVar.f1119e);
        InterfaceExecutorServiceC13317e interfaceExecutorServiceC13317e = (InterfaceExecutorServiceC13317e) f33119e.get();
        interfaceExecutorServiceC13317e.getClass();
        this.f33123e = interfaceExecutorServiceC13317e;
        this.f33120e = crashlyticsVar.f1117e;
        this.f33122e = crashlyticsVar.f1118e;
    }

    @Override // defpackage.InterfaceC14343e
    public final ListenableFuture billing(C12053e c12053e) {
        byte[] bArr = c12053e.mopub;
        if (bArr != null) {
            return smaato(bArr);
        }
        Uri uri = c12053e.amazon;
        if (uri == null) {
            return null;
        }
        return ((C0918e) this.f33123e).ad(new CallableC9258e(this, uri, 1));
    }

    @Override // defpackage.InterfaceC14343e
    public final ListenableFuture smaato(byte[] bArr) {
        return ((C0918e) this.f33123e).ad(new CallableC9258e(this, bArr, 0));
    }
}
