package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3263e {
    public static final C16089e ad;

    /* JADX WARN: Type inference failed for: r5v0, types: [eٟٓٙ, java.lang.Object, eٌۗۛ] */
    static {
        C16629e c16629e;
        ((C8140e) AbstractC2988e.ad).getClass();
        AtomicReference atomicReference = C14066e.purchase;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            C12386e c12386e = (C12386e) atomicReference.get();
            c16629e = new C16629e(str, c12386e.ad, c12386e.vip, c12386e.metrica);
        } else {
            int i = 7;
            while (true) {
                if (i >= 0) {
                    char charAt = "Phlogger".charAt(i);
                    if (charAt != '$') {
                        if (charAt == '.') {
                            break;
                        } else {
                            i--;
                        }
                    } else {
                        str = "Phlogger".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            ?? abstractC8918e = new AbstractC8918e(str);
            if (C14066e.metrica || C14066e.license) {
                abstractC8918e.vip = new C15526e(str);
            } else if (C14066e.appmetrica) {
                C12386e c12386e2 = C16629e.yandex;
                abstractC8918e.vip = new C16629e(str, Level.OFF, c12386e2.vip, c12386e2.metrica);
            } else {
                abstractC8918e.vip = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = AbstractC3122e.ad;
            concurrentLinkedQueue.offer(abstractC8918e);
            c16629e = abstractC8918e;
            if (atomicReference.get() != null) {
                while (true) {
                    C14066e c14066e = (C14066e) concurrentLinkedQueue.poll();
                    if (c14066e == null) {
                        break;
                    }
                    C12386e c12386e3 = (C12386e) atomicReference.get();
                    c14066e.vip = new C16629e(c14066e.ad, c12386e3.ad, c12386e3.vip, c12386e3.metrica);
                }
                C14066e.license();
                c16629e = abstractC8918e;
            }
        }
        ad = new C16089e(c16629e);
    }
}
