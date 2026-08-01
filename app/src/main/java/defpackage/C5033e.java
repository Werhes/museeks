package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5033e extends C13065e implements InterfaceC18435e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C12781e f10719e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final InterfaceC8850e f10720e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final String f10721e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C5389e f10722e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C11380e f10723e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final InterfaceC8850e f10724e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [eؙۧؐ, eُۥٔ, eٌِٞ] */
    public C5033e(C11467e c11467e, boolean z, C5389e c5389e, InterfaceC8850e interfaceC8850e, C12781e c12781e) {
        super(z, c11467e);
        this.f10721e = BuildConfig.FLAVOR;
        this.f10722e = c5389e;
        this.f10720e = interfaceC8850e;
        this.f10719e = c12781e;
        ?? c6799e = new C6799e((InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e));
        this.f10723e = c6799e;
        this.f10724e = interfaceC8850e.mo394const(c6799e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object admob(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C10964e
            if (r0 == 0) goto L13
            r0 = r5
            eُّٕ r0 = (defpackage.C10964e) r0
            int r1 = r0.f21719e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21719e = r1
            goto L18
        L13:
            eُّٕ r0 = new eُّٕ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21718e
            int r1 = r0.f21719e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L3d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f21719e = r2
            eُۥٔ r5 = r4.f10723e
            java.lang.Object r5 = defpackage.AbstractC6629e.purchase(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L3d
            return r0
        L3d:
            eؘۙٗ r5 = defpackage.AbstractC2094e.metrica(r4)
            java.util.List r5 = r5.license()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r5.next()
            eًۛؗ r0 = (defpackage.C8208e) r0
            eؘۙٗ r1 = r4.f9085e
            eًۛؗ r2 = defpackage.AbstractC2094e.ad
            java.lang.Object r1 = r1.purchase(r2)
            eؘۙٗ r1 = (defpackage.C5874e) r1
            if (r1 != 0) goto L62
            goto L49
        L62:
            java.lang.Object r2 = r1.purchase(r0)
            if (r2 != 0) goto L69
            goto L49
        L69:
            boolean r3 = r2 instanceof java.lang.AutoCloseable
            if (r3 == 0) goto Lb9
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2
            boolean r3 = r2 instanceof java.lang.AutoCloseable
            if (r3 == 0) goto L77
            r2.close()
            goto Lb9
        L77:
            boolean r3 = r2 instanceof java.util.concurrent.ExecutorService
            if (r3 == 0) goto L81
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            defpackage.AbstractC6418e.smaato(r2)
            goto Lb9
        L81:
            boolean r3 = r2 instanceof android.content.res.TypedArray
            if (r3 == 0) goto L8b
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r2.recycle()
            goto Lb9
        L8b:
            boolean r3 = r2 instanceof android.media.MediaMetadataRetriever
            if (r3 == 0) goto L95
            android.media.MediaMetadataRetriever r2 = (android.media.MediaMetadataRetriever) r2
            r2.release()
            goto Lb9
        L95:
            boolean r3 = r2 instanceof android.media.MediaDrm
            if (r3 == 0) goto L9f
            android.media.MediaDrm r2 = (android.media.MediaDrm) r2
            r2.release()
            goto Lb9
        L9f:
            boolean r3 = r2 instanceof android.drm.DrmManagerClient
            if (r3 == 0) goto La9
            android.drm.DrmManagerClient r2 = (android.drm.DrmManagerClient) r2
            r2.release()
            goto Lb9
        La9:
            boolean r3 = r2 instanceof android.content.ContentProviderClient
            if (r3 == 0) goto Lb3
            android.content.ContentProviderClient r2 = (android.content.ContentProviderClient) r2
            r2.release()
            goto Lb9
        Lb3:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        Lb9:
            java.util.Map r1 = r1.appmetrica()
            r1.remove(r0)
            goto L49
        Lc1:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5033e.admob(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f10724e;
    }
}
