package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۦۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6797e {
    public final C5363e ad;
    public final AtomicBoolean adcel;
    public final C9576e appmetrica;
    public final C5363e billing;
    public final C4373e license;
    public final C5891e metrica;
    public final C8765e purchase;
    public final Object startapp;
    public final C11725e vip;
    public Object yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [eؙۦۦ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [eٌٟ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public C6797e(C5363e c5363e, Context context, C7193e c7193e, C17424e c17424e, C11725e c11725e, C5891e c5891e, C4373e c4373e) {
        ?? r8;
        this.ad = c5363e;
        this.vip = c11725e;
        this.metrica = c5891e;
        this.license = c4373e;
        this.appmetrica = new C9576e((C9872e) c5363e.getValue(), ((C9872e) c5363e.getValue()).vip());
        C5363e c5363e2 = new C5363e(new C9411e(context, c7193e, (Object) this, c17424e, 1));
        this.billing = c5363e2;
        this.yandex = C3295e.f7451e;
        this.startapp = new Object();
        this.adcel = new AtomicBoolean(false);
        ArrayList metrica = AbstractC17861e.metrica(((C7646e) c5363e2.getValue()).ad());
        if (metrica != null) {
            r8 = new ArrayList(AbstractC0746e.subscription(metrica, 10));
            Iterator it = metrica.iterator();
            while (it.hasNext()) {
                r8.add(((C5060e) it.next()).ad);
            }
        } else {
            r8 = C13664e.f27089e;
        }
        C4013e c4013e = ((C5327e) ((C9872e) this.ad.getValue()).vip().ad()).vip.mopub;
        C14826e ad = AbstractC9743e.ad(AbstractC18275e.purchase(c7193e.ad));
        ?? obj = new Object();
        obj.f17669e = new Object();
        obj.f17667e = new CopyOnWriteArrayList();
        obj.f17666e = null;
        obj.f17673e = false;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = r8.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC11906e.yandex((String) it2.next(), null, null));
        }
        obj.f17671e = arrayList;
        obj.f17675e = c4013e;
        obj.f17674e = ad;
        obj.f17670e = new AtomicBoolean(false);
        obj.f17668e = (CameraManager) context.getSystemService("camera");
        this.purchase = obj;
        license(r8);
    }

    public final LinkedHashSet ad(List list) {
        String str;
        C5363e c5363e = this.billing;
        C7646e c7646e = (C7646e) c5363e.getValue();
        List<String> m3575continue = AbstractC13480e.m3575continue(list);
        C5891e c5891e = this.metrica;
        try {
            ArrayList arrayList = new ArrayList();
            C16417e ad = c7646e.ad();
            C11725e c11725e = this.vip;
            if (c11725e != null) {
                try {
                    str = AbstractC8178e.license(ad, c11725e.vip());
                } catch (IllegalStateException e) {
                    if (AbstractC9464e.smaato("CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : m3575continue) {
                    if (!AbstractC7890e.billing(str2, str)) {
                        C7646e c7646e2 = c7646e.vip;
                        C5060e.ad(str2);
                        arrayList2.add(((InterfaceC2881e) new C5084e(c7646e2, new C6140e(str2, 1), c5891e).isPro.get()).subscription());
                    }
                }
                Iterator it = c11725e.ad(arrayList2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC12424e) it.next()).billing());
                }
                m3575continue = arrayList;
            }
            C16417e ad2 = ((C7646e) c5363e.getValue()).ad();
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : m3575continue) {
                if (AbstractC7890e.billing(str3, "0") || AbstractC7890e.billing(str3, "1")) {
                    arrayList3.add(str3);
                } else if (AbstractC6286e.adcel(ad2, str3)) {
                    arrayList3.add(str3);
                } else if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (AbstractC9464e.amazon()) {
                Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new Exception(e2);
        }
    }

    public final void license(List list) {
        if (this.adcel.get()) {
            return;
        }
        LinkedHashSet ad = ad(list);
        synchronized (this.startapp) {
            try {
                if (this.adcel.get()) {
                    return;
                }
                if (AbstractC7890e.billing(this.yandex, ad)) {
                    return;
                }
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + this.yandex + " -> " + ad);
                }
                this.yandex = ad;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC2881e metrica(String str) {
        if (this.adcel.get()) {
            throw new Exception("CameraFactory has been shut down.");
        }
        C7646e c7646e = ((C7646e) this.billing.getValue()).vip;
        C5060e.ad(str);
        return (InterfaceC2881e) new C5084e(c7646e, new C6140e(str, 1), this.metrica).isPro.get();
    }

    public final Set vip() {
        synchronized (this.startapp) {
            if (this.adcel.get()) {
                return C3295e.f7451e;
            }
            return new LinkedHashSet((Collection) this.yandex);
        }
    }
}
