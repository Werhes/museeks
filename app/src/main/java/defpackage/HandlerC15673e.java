package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC15673e extends Handler {
    public final /* synthetic */ C14090e metrica;
    public final ArrayList ad = new ArrayList();
    public final ArrayList vip = new ArrayList();

    public HandlerC15673e(C14090e c14090e) {
        this.metrica = c14090e;
    }

    public static void ad(C1995e c1995e, int i, Object obj, int i2) {
        C6541e c6541e;
        C6541e c6541e2;
        C10085e c10085e = c1995e.ad;
        AbstractC17065e abstractC17065e = c1995e.vip;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    abstractC17065e.amazon((C16936e) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    abstractC17065e.ad();
                    return;
                case 514:
                    abstractC17065e.metrica();
                    return;
                case 515:
                    abstractC17065e.vip();
                    return;
                default:
                    return;
            }
        }
        if (i == 264 || i == 262) {
            C12957e c12957e = (C12957e) obj;
            C6541e c6541e3 = c12957e.vip;
            c6541e = c12957e.ad;
            c6541e2 = c6541e3;
        } else {
            if (i == 265 || i == 266) {
                throw AbstractC8647e.isVip(obj);
            }
            c6541e2 = (C6541e) obj;
            c6541e = null;
        }
        if (c6541e2 != null) {
            boolean z = true;
            if ((c1995e.license & 2) == 0 && !c6541e2.yandex(c1995e.metrica)) {
                C16936e c16936e = C10085e.metrica().signatures;
                z = ((c16936e == null ? false : c16936e.metrica) && c6541e2.license() && i == 262 && i2 == 3 && c6541e != null) ? true ^ c6541e.license() : false;
            }
            if (z) {
                switch (i) {
                    case 257:
                        abstractC17065e.license(c10085e, c6541e2);
                        return;
                    case 258:
                        abstractC17065e.yandex(c10085e, c6541e2);
                        return;
                    case 259:
                        abstractC17065e.appmetrica(c10085e, c6541e2);
                        return;
                    case 260:
                        abstractC17065e.smaato(c6541e2);
                        return;
                    case 261:
                        abstractC17065e.getClass();
                        return;
                    case 262:
                        abstractC17065e.adcel(c10085e, c6541e2, i2, c6541e2);
                        return;
                    case 263:
                        abstractC17065e.advert(c10085e, c6541e2, i2);
                        return;
                    case 264:
                        abstractC17065e.adcel(c10085e, c6541e2, i2, c6541e);
                        return;
                    case 265:
                        abstractC17065e.purchase(c6541e, c6541e2);
                        return;
                    case 266:
                        abstractC17065e.billing(c6541e, c6541e2, i2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int mopub;
        ArrayList arrayList = this.ad;
        C14090e c14090e = this.metrica;
        ArrayList arrayList2 = c14090e.yandex;
        C6779e c6779e = c14090e.remoteconfig;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && c14090e.yandex().metrica.equals(((C6541e) obj).metrica)) {
            c14090e.admob(true);
        }
        ArrayList arrayList3 = this.vip;
        if (i == 262) {
            C12957e c12957e = (C12957e) obj;
            C6541e c6541e = c12957e.vip;
            if (c12957e.metrica) {
                c6779e.admob(c6541e);
            }
            if (c14090e.tapsense != null && c6541e.license()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    c6779e.Signature((C6541e) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    c6779e.loadAd((C6541e) obj);
                    break;
                case 258:
                    c6779e.Signature((C6541e) obj);
                    break;
                case 259:
                    C6541e c6541e2 = (C6541e) obj;
                    c6779e.getClass();
                    if (c6541e2.metrica() != c6779e && (mopub = c6779e.mopub(c6541e2)) >= 0) {
                        C6779e.pro((C8147e) c6779e.f13985e.get(mopub));
                        break;
                    }
                    break;
            }
        } else {
            C12957e c12957e2 = (C12957e) obj;
            C6541e c6541e3 = c12957e2.vip;
            arrayList3.add(c6541e3);
            c6779e.loadAd(c6541e3);
            if (c12957e2.metrica) {
                c6779e.admob(c6541e3);
            }
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ad((C1995e) it2.next(), i, obj, i2);
                    }
                    arrayList.clear();
                    return;
                }
                C10085e c10085e = (C10085e) ((WeakReference) arrayList2.get(size)).get();
                if (c10085e == null) {
                    arrayList2.remove(size);
                } else {
                    arrayList.addAll(c10085e.vip);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final void vip(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }
}
