package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17179e implements InterfaceC5429e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C8938e f33676e;

    public C17179e(C8938e c8938e) {
        this.f33676e = c8938e;
    }

    @Override // defpackage.InterfaceC5429e
    public final void ad() {
        this.f33676e.f17905e.remove(this);
    }

    @Override // defpackage.InterfaceC5429e
    public final boolean vip(Uri uri, C13572e c13572e, boolean z) {
        C4232e c4232e;
        C8938e c8938e = this.f33676e;
        HashMap hashMap = c8938e.f17919e;
        if (c8938e.f17913e == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4232e c4232e2 = (C4232e) hashMap.get(uri);
            c4232e2.getClass();
            C15214e c15214e = c4232e2.ad;
            int size = c15214e.vip.size();
            AbstractC7014e it = AbstractC12614e.admob(c15214e.vip.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                C4232e c4232e3 = (C4232e) hashMap.get(uri2);
                if (c4232e3 != null) {
                    C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e3.vip, uri2, uri2);
                    c15762e.getClass();
                    if (elapsedRealtime <= c15762e.f31047e) {
                        i++;
                    }
                }
            }
            int size2 = c8938e.f17907e.size();
            C2171e listIterator = c8938e.f17907e.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                if (c8938e.billing((C15214e) listIterator.next(), elapsedRealtime)) {
                    i2++;
                }
            }
            C9436e remoteconfig = c8938e.f17908e.remoteconfig(new C6008e(size, i, size2, i2), c13572e);
            if (remoteconfig != null && (c4232e = (C4232e) hashMap.get(uri)) != null) {
                return C4232e.metrica(c4232e, uri, remoteconfig.f18775e);
            }
        }
        return false;
    }
}
