package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14262e {
    public long Signature;
    public final InterfaceC18147e ad;
    public long adcel;
    public long admob;
    public long advert;
    public byte[] billing;
    public final boolean metrica;
    public final C18437e purchase;
    public boolean remoteconfig;
    public int startapp;
    public boolean subscription;
    public final boolean vip;
    public int yandex;
    public final SparseArray license = new SparseArray();
    public final SparseArray appmetrica = new SparseArray();
    public C0102e smaato = new Object();
    public C0102e amazon = new Object();
    public boolean mopub = false;
    public boolean loadAd = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [eؑؖۚ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eؑؖۚ, java.lang.Object] */
    public C14262e(InterfaceC18147e interfaceC18147e, boolean z, boolean z2) {
        this.ad = interfaceC18147e;
        this.vip = z;
        this.metrica = z2;
        byte[] bArr = new byte[128];
        this.billing = bArr;
        this.purchase = new C18437e(bArr, 0, 0);
        C0102e c0102e = this.amazon;
        c0102e.vip = false;
        c0102e.ad = false;
    }
}
