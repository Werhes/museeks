package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11087e {
    public static final List Signature;
    public static final List admob;
    public static final Map advert;
    public static final Object amazon = null;
    public static final C8823e loadAd;
    public static final Object remoteconfig = null;
    public static final Map smaato;
    public static final List subscription;
    public final C9823e ad;
    public C8823e appmetrica;
    public final C16354e license;
    public final C13585e metrica;
    public final InterfaceC2531e vip;
    public static final List purchase = AbstractC6874e.startapp(2, 4, 3);
    public static final List billing = AbstractC6874e.startapp(2, 3);
    public static final List yandex = AbstractC6874e.startapp(2, 6, 4, 5);
    public static final List startapp = Collections.singletonList(3);
    public static final List adcel = Collections.singletonList(3);
    public static final List mopub = AbstractC6874e.startapp(4, 5);

    static {
        AbstractC6874e.startapp(2, 4, 3);
        AbstractC6874e.startapp(2, 3);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        advert = Collections.singletonMap(key, 1);
        smaato = Collections.singletonMap(key, 2);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        Collections.singletonMap(key2, 1);
        AbstractC10064e.purchase(new C6571e(key, 1), new C6571e(key2, 1));
        loadAd = AbstractC16565e.ad(new C4405e(4, null));
        Signature = AbstractC6874e.startapp(0, 1, 2, 4);
        List startapp2 = AbstractC6874e.startapp(0, 3, 1, 2, 6);
        admob = startapp2;
        subscription = AbstractC6874e.startapp(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        Collections.singletonMap(key3, bool);
        AbstractC10064e.purchase(new C6571e(key, 2), new C6571e(key3, bool));
        Collections.singletonMap(key3, Boolean.FALSE);
        Collections.singletonMap(key2, 2);
        AbstractC10064e.purchase(new C6571e(key, 2), new C6571e(key2, 2));
        new C12065e(1, Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, startapp2));
    }

    public C11087e(C9823e c9823e, InterfaceC2531e interfaceC2531e, C13585e c13585e, C16354e c16354e) {
        this.ad = c9823e;
        this.vip = interfaceC2531e;
        this.metrica = c13585e;
        this.license = c16354e;
    }

    public static C8823e vip(C11087e c11087e, C6510e c6510e, C2548e c2548e, C12332e c12332e, C13743e c13743e, List list, List list2, List list3, int i) {
        C2548e c2548e2 = (i & 2) != 0 ? null : c2548e;
        C12332e c12332e2 = (i & 4) != 0 ? null : c12332e;
        C13743e c13743e2 = (i & 8) != 0 ? null : c13743e;
        List list4 = (i & 16) != 0 ? null : list;
        List list5 = (i & 32) != 0 ? null : list2;
        List list6 = (i & 64) != 0 ? null : list3;
        if (c11087e.ad.vip.purchase() == null) {
            C13585e.vip(c11087e.metrica, c6510e, c2548e2, c12332e2, c13743e2, list4, list5, list6, null, null, null, 896);
            c11087e.ad.purchase(c11087e.metrica.ad());
            return loadAd;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c6510e != null) {
        }
        if (c2548e2 != null) {
        }
        if (c12332e2 != null) {
        }
        if (c13743e2 != null) {
        }
        C3664e c3664e = new C3664e(new C12065e(1, AbstractC10064e.advert(linkedHashMap)), null, null);
        c11087e.license.appmetrica(c3664e);
        C13585e.vip(c11087e.metrica, c6510e, c2548e2, c12332e2, c13743e2, list4, list5, list6, null, null, null, 896);
        c11087e.ad.purchase(c11087e.metrica.ad());
        C8823e c8823e = c3664e.f8244e;
        synchronized (c11087e) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + c11087e.appmetrica);
                C8823e c8823e2 = c11087e.appmetrica;
                if (c8823e2 != null) {
                    AbstractC6629e.appmetrica(c8823e2, "A newer call for 3A state update initiated.", null);
                }
                c11087e.appmetrica = c8823e;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8823e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d6, code lost:
    
        if (r9.appmetrica(defpackage.C11087e.smaato) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00de, code lost:
    
        if (r48.ad == 1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Type inference failed for: r4v2, types: [eّؖٝ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(java.util.List r45, java.util.List r46, java.util.List r47, defpackage.C12236e r48, defpackage.C12236e r49, defpackage.C12236e r50, defpackage.C6510e r51, kotlin.jvm.functions.Function1 r52, int r53, java.lang.Long r54, java.lang.Long r55, defpackage.AbstractC10731e r56) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11087e.ad(java.util.List, java.util.List, java.util.List, eّؔٞ, eّؔٞ, eّؔٞ, eؙؙٜ, kotlin.jvm.functions.Function1, int, java.lang.Long, java.lang.Long, eُؑ۠):java.lang.Object");
    }
}
