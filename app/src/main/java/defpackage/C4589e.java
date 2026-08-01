package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4589e {
    public static final C4589e ad = new Object();

    public void ad(InterfaceC12438e interfaceC12438e, C10379e c10379e) {
        C9937e mo835default = interfaceC12438e.mo835default();
        C17015e c17015e = C17015e.f33328e;
        C14326e c14326e = C9937e.purchase;
        HashSet hashSet = new HashSet();
        C4069e license = C4069e.license();
        ArrayList arrayList = new ArrayList();
        C5489e ad2 = C5489e.ad();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C17015e vip = C17015e.vip(license);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C18543e c18543e = C18543e.vip;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = ad2.ad;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new C9937e(arrayList2, vip, -1, arrayList3, new C18543e(arrayMap));
        if (mo835default != null) {
            i = mo835default.metrica;
            c10379e.mopub(mo835default.license);
            c17015e = mo835default.vip;
            ((C5489e) c10379e.f20512e).ad.putAll((Map) mo835default.appmetrica.ad);
            Iterator it = DesugarCollections.unmodifiableList(mo835default.ad).iterator();
            while (it.hasNext()) {
                ((HashSet) c10379e.f20508e).add((AbstractC5113e) it.next());
            }
        }
        c10379e.f20510e = C4069e.purchase(c17015e);
        c10379e.f20509e = ((Number) interfaceC12438e.smaato(C11456e.f23055e, Integer.valueOf(i))).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) interfaceC12438e.smaato(C11456e.f23057e, null);
        if (captureCallback != null) {
            c10379e.amazon(new C17839e(captureCallback));
        }
        C17974e c17974e = new C17974e(6);
        interfaceC12438e.metrica(new C11565e(c17974e, interfaceC12438e, 1));
        c10379e.pro(new C2362e(7, C17015e.vip((C4069e) c17974e.f35233e)));
    }
}
