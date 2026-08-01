package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9398e implements InterfaceC18435e, Closeable {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18701e = AtomicIntegerFieldUpdater.newUpdater(C9398e.class, "closed");
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC8850e f18702e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C9964e f18703e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f18704e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C5874e f18705e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9964e f18706e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C13886e f18707e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C5389e f18708e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C6799e f18709e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C13886e f18710e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14947e f18711e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C13886e f18712e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13886e f18713e;

    public C9398e(C14947e c14947e, C9964e c9964e, boolean z) {
        this.f18711e = c14947e;
        this.f18706e = c9964e;
        boolean z2 = false;
        C6799e c6799e = new C6799e((InterfaceC10500e) c14947e.f29634e.mo397public(C4524e.f9798e));
        this.f18709e = c6799e;
        this.f18702e = c14947e.f29634e.mo394const(c6799e);
        int i = 3;
        this.f18713e = new C13886e(3);
        this.f18712e = new C13886e(4);
        C13886e c13886e = new C13886e(5);
        this.f18707e = c13886e;
        this.f18710e = new C13886e(2);
        int i2 = 1;
        this.f18705e = AbstractC12176e.ad(true);
        this.f18708e = new C5389e(12);
        C9964e c9964e2 = new C9964e();
        this.f18703e = c9964e2;
        if (this.f18704e) {
            c6799e.mo692else(new C2109e(i2, this));
        }
        InterfaceC5083e interfaceC5083e = null;
        c13886e.mopub(C13886e.f27537e, new C17699e(this, c14947e, null));
        c13886e.mopub(C13886e.f27527e, new C1053e(this, interfaceC5083e, 8));
        int i3 = 11;
        c9964e2.ad(AbstractC7609e.vip, new C14407e(i3));
        c9964e2.ad(AbstractC4902e.metrica, new C14407e(i3));
        c9964e2.ad(AbstractC8978e.license, new C14407e(i3));
        if (c9964e.f19682e) {
            ((LinkedHashMap) c9964e2.f19680e).put("DefaultTransformers", new C14407e(10));
        }
        c9964e2.ad(C8007e.vip, new C14407e(i3));
        C0909e c0909e = AbstractC14421e.vip;
        c9964e2.ad(c0909e, new C14407e(i3));
        if (c9964e.f19684e) {
            c9964e2.ad(AbstractC2588e.license, new C14407e(i3));
        }
        c9964e2.metrica(c9964e);
        if (c9964e.f19682e) {
            c9964e2.ad(AbstractC0245e.vip, new C14407e(i3));
        }
        C8208e c8208e = AbstractC16095e.ad;
        c9964e2.ad(c0909e, new C2163e(c9964e2));
        Iterator it = ((LinkedHashMap) c9964e2.f19681e).values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = ((LinkedHashMap) c9964e2.f19680e).values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        this.f18712e.mopub(C13886e.f27531e, new C12358e(this, z2, interfaceC5083e, i));
        this.f18704e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C10263e r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C17504e
            if (r0 == 0) goto L13
            r0 = r6
            e٘ؓٛ r0 = (defpackage.C17504e) r0
            int r1 = r0.f34328e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34328e = r1
            goto L18
        L13:
            e٘ؓٛ r0 = new e٘ؓٛ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f34327e
            int r1 = r0.f34328e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L46
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eؘؓٞ r6 = r4.f18708e
            eؒۙ۠ r1 = defpackage.AbstractC2774e.f6686e
            r6.premium(r1, r5)
            java.lang.Object r6 = r5.license
            r0.f34328e = r2
            eٍٓٚ r1 = r4.f18713e
            java.lang.Object r6 = r1.vip(r5, r6, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r6 != r5) goto L46
            return r5
        L46:
            eؗٝٝ r6 = (defpackage.C5042e) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9398e.ad(eَٔٔ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f18702e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f18701e.compareAndSet(this, 0, 1)) {
            C5874e c5874e = (C5874e) this.f18705e.metrica(AbstractC5341e.ad);
            Iterator it = c5874e.license().iterator();
            while (it.hasNext()) {
                Object metrica = c5874e.metrica((C8208e) it.next());
                if (metrica instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) metrica;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        AbstractC6418e.smaato((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
            }
            this.f18709e.m2245e();
            if (this.f18704e) {
                this.f18711e.close();
            }
        }
    }

    public final String toString() {
        return "HttpClient[" + this.f18711e + ']';
    }
}
