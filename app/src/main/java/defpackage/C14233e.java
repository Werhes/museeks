package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14233e implements AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f28115e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13322e f28116e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16964e f28117e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f28118e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Map f28119e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f28120e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2107e f28121e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final LinkedHashMap f28122e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final LinkedHashMap f28123e;

    public C14233e(C2107e c2107e, C7850e c7850e, C13322e c13322e, Map map) {
        this.f28121e = c2107e;
        this.f28117e = c7850e;
        this.f28116e = c13322e;
        this.f28119e = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((AbstractC7905e) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f28123e = linkedHashMap;
        this.f28122e = new LinkedHashMap();
        this.f28118e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r1 = defpackage.C9139e.f18290e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f28115e
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            eّؓۜ r2 = r9.f28121e     // Catch: java.lang.Throwable -> L4c
            java.util.List r2 = r2.f5444e     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4c
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4c
            eِّۚ r3 = (defpackage.C12730e) r3     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r4 = r3.mopub     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4c
        L22:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L10
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L4c
            eّ٘ۚ r5 = (defpackage.C12550e) r5     // Catch: java.lang.Throwable -> L4c
            java.util.LinkedHashMap r6 = r9.f28123e     // Catch: java.lang.Throwable -> L4c
            int r7 = r5.ad     // Catch: java.lang.Throwable -> L4c
            eِْٕ r8 = new eِْٕ     // Catch: java.lang.Throwable -> L4c
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L4c
            android.view.Surface r6 = (android.view.Surface) r6     // Catch: java.lang.Throwable -> L4c
            if (r6 != 0) goto L4e
            eٕۢٝ r5 = r3.purchase     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            if (r5 != 0) goto L22
            eٌۧۘ r1 = defpackage.C9139e.f18290e     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r0)
            goto L59
        L4c:
            r1 = move-exception
            goto L6c
        L4e:
            int r5 = r5.ad     // Catch: java.lang.Throwable -> L4c
            eِْٕ r7 = new eِْٕ     // Catch: java.lang.Throwable -> L4c
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            r1.put(r7, r6)     // Catch: java.lang.Throwable -> L4c
            goto L22
        L59:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L60
            return
        L60:
            eِّٗ r0 = r9.f28117e
            java.lang.Object r0 = r0.get()
            eًٍؗ r0 = (defpackage.C4760e) r0
            r0.startapp(r1)
            return
        L6c:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14233e.ad():void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f28115e) {
            if (this.f28120e) {
                return;
            }
            this.f28120e = true;
            this.f28123e.clear();
            List<AutoCloseable> m3575continue = AbstractC13480e.m3575continue(this.f28122e.values());
            this.f28122e.clear();
            for (AutoCloseable autoCloseable : m3575continue) {
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
    }

    public final void license() {
        synchronized (this.f28115e) {
            try {
                if (this.f28120e) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.f28123e.values()) {
                    this.f28122e.put(surface, this.f28116e.ad(surface));
                }
                this.f28118e = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void purchase() {
        List<AutoCloseable> m3575continue;
        synchronized (this.f28115e) {
            this.f28118e = false;
            m3575continue = AbstractC13480e.m3575continue(this.f28122e.values());
            this.f28122e.clear();
        }
        for (AutoCloseable autoCloseable : m3575continue) {
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
}
