package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16550e {
    public static final /* synthetic */ AtomicReference ad = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v15, types: [eّۚٞ] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [eؚؚؑ] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [eؚؚؑ] */
    /* JADX WARN: Type inference failed for: r4v8, types: [eِۥۡ] */
    public static final InterfaceC12732e ad(Context context) {
        C0624e c0624e;
        C0624e c0624e2;
        AtomicReference atomicReference = ad;
        Object obj = atomicReference.get();
        InterfaceC12732e interfaceC12732e = obj instanceof InterfaceC12732e ? (InterfaceC12732e) obj : null;
        if (interfaceC12732e != null) {
            return interfaceC12732e;
        }
        C0624e c0624e3 = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof InterfaceC12732e) {
                c0624e = c0624e3;
                c0624e2 = (InterfaceC12732e) obj2;
            } else {
                if (c0624e3 == null) {
                    ?? applicationContext = context.getApplicationContext();
                    ?? r4 = obj2 instanceof InterfaceC0161e ? (InterfaceC0161e) obj2 : 0;
                    if (r4 != 0) {
                        c0624e3 = r4.ad(applicationContext);
                    } else {
                        ?? r42 = applicationContext instanceof InterfaceC0161e ? (InterfaceC0161e) applicationContext : 0;
                        c0624e3 = r42 != 0 ? r42.ad(applicationContext) : AbstractC12119e.ad.ad(applicationContext);
                    }
                }
                C0624e c0624e4 = c0624e3;
                c0624e = c0624e4;
                c0624e2 = c0624e4;
            }
            while (!atomicReference.compareAndSet(obj2, c0624e2)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            return c0624e2;
            c0624e3 = c0624e;
        }
    }
}
