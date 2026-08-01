package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.File;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16389e implements InterfaceC16883e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final long[] f32192e = new long[0];

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f32193e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f32194e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f32195e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f32196e;

    public C16389e() {
        this.f32196e = 0L;
        this.f32195e = new C14434e();
    }

    public C16389e(InterfaceC9998e interfaceC9998e, C14874e c14874e) {
        this.f32194e = interfaceC9998e;
        this.f32193e = c14874e;
        int purchase = interfaceC9998e.purchase();
        if (purchase <= 64) {
            this.f32196e = purchase != 64 ? (-1) << purchase : 0L;
            this.f32195e = f32192e;
            return;
        }
        this.f32196e = 0L;
        int i = (purchase - 1) >>> 6;
        long[] jArr = new long[i];
        if ((purchase & 63) != 0) {
            jArr[i - 1] = (-1) << purchase;
        }
        this.f32195e = jArr;
    }

    public C16389e(C14899e c14899e) {
        this.f32196e = TimeUnit.MINUTES.toNanos(5L);
        this.f32194e = c14899e.license();
        this.f32193e = new C14799e(this, AbstractC1786e.signatures(new StringBuilder(), AbstractC16286e.vip, " ConnectionPool connection closer"));
        this.f32195e = new ConcurrentLinkedQueue();
    }

    public C16389e(C15099e c15099e) {
        this.f32194e = new ArrayList();
        this.f32193e = new ArrayList();
        this.f32195e = new ArrayList();
        this.f32196e = 5000L;
        ad(c15099e, 1);
    }

    public C16389e(C16389e c16389e) {
        this.f32194e = DesugarCollections.unmodifiableList((ArrayList) c16389e.f32194e);
        this.f32193e = DesugarCollections.unmodifiableList((ArrayList) c16389e.f32193e);
        this.f32195e = DesugarCollections.unmodifiableList((ArrayList) c16389e.f32195e);
        this.f32196e = c16389e.f32196e;
    }

    public C16389e(NativePointer nativePointer, long j, InterfaceC7227e interfaceC7227e, C17974e c17974e) {
        this.f32194e = nativePointer;
        this.f32196e = j;
        this.f32193e = interfaceC7227e;
        this.f32195e = c17974e;
    }

    public C16389e(File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
        this.f32194e = file;
        this.f32193e = parcelFileDescriptor;
        this.f32196e = j;
        this.f32195e = uri;
    }

    public void ad(C15099e c15099e, int i) {
        AbstractC4265e.license(i >= 1 && i <= 7, "Invalid metering mode " + i);
        if ((i & 1) != 0) {
            ((ArrayList) this.f32194e).add(c15099e);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.f32193e).add(c15099e);
        }
    }

    @Override // defpackage.InterfaceC16883e
    public InterfaceC14666e billing(AbstractC14297e abstractC14297e) {
        C16981e yandex = abstractC14297e.yandex();
        NativePointer nativePointer = (NativePointer) this.f32194e;
        long j = this.f32196e;
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) this.f32193e;
        C17974e c17974e = (C17974e) this.f32195e;
        NativePointer nativePointer2 = yandex.f33290e;
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer2).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C1649e(yandex, new LongPointerWrapper(realmcJNI.realm_results_resolve_in(ptr$cinterop_release, ptr$cinterop_release2), false, 2, null), j, interfaceC7227e, c17974e);
    }

    @Override // defpackage.InterfaceC16883e
    public AbstractC1984e loadAd(InterfaceC9543e interfaceC9543e) {
        return new C6353e(interfaceC9543e, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r7 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C2266e metrica(java.lang.String r20, defpackage.C2266e r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16389e.metrica(java.lang.String, eؓۨٙ):eؓۨٙ");
    }

    public int vip(C0177e c0177e, long j) {
        TimeZone timeZone = AbstractC16286e.ad;
        ArrayList arrayList = c0177e.Signature;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c0177e.metrica.ad.yandex + " was leaked. Did you forget to close a response body?";
                AbstractC18303e abstractC18303e = AbstractC18303e.ad;
                AbstractC18303e.ad.mopub(((C14793e) reference).ad, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c0177e.admob = j - this.f32196e;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
