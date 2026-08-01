package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11109e {
    public final ArrayList ad;
    public final Object appmetrica;
    public final /* synthetic */ int license;
    public final CopyOnWriteArrayList metrica;
    public boolean vip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11109e(int i, Object obj) {
        this(false);
        this.license = i;
        this.appmetrica = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public C11109e(C4850e c4850e) {
        this(c4850e.appmetrica());
        this.license = 6;
        this.appmetrica = c4850e;
        c4850e.metrica = AbstractC4511e.Signature(c4850e.metrica, new C6846e(16, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11109e(C14820e c14820e) {
        this(true);
        this.license = 7;
        this.appmetrica = c14820e;
    }

    public C11109e(boolean z) {
        this.ad = new ArrayList();
        this.vip = z;
        this.metrica = new CopyOnWriteArrayList();
    }

    public final void ad() {
    }

    public final void appmetrica(boolean z) {
        this.vip = z;
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C8198e c8198e = (C8198e) it.next();
            c8198e.purchase(c8198e.appmetrica && z);
        }
    }

    public final void license() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.metrica;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
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
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.ad;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C8198e) it2.next()).appmetrica();
        }
        arrayList.clear();
    }

    public final void metrica(C0419e c0419e) {
    }

    public final void vip(C0419e c0419e) {
    }
}
