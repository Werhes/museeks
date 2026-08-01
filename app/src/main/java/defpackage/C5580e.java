package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5580e implements InterfaceC12165e {
    public static final AtomicReference ad = new AtomicReference();

    @Override // defpackage.InterfaceC12165e
    public final void ad(boolean z) {
        synchronized (C14679e.mopub) {
            try {
                Iterator it = new ArrayList(C14679e.advert.values()).iterator();
                while (it.hasNext()) {
                    C14679e c14679e = (C14679e) it.next();
                    if (c14679e.appmetrica.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = c14679e.startapp.iterator();
                        while (it2.hasNext()) {
                            C14679e c14679e2 = ((C12158e) it2.next()).ad;
                            if (!z) {
                                ((C18162e) c14679e2.yandex.get()).metrica();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
