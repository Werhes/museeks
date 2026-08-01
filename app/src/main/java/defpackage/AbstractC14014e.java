package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14014e {
    public static final C1032e[] ad = new C1032e[0];
    public static final C12949e license;
    public static final C12949e metrica;
    public static final C1032e vip;

    static {
        C1032e c1032e = new C1032e(1L, "vision.barcode");
        vip = c1032e;
        C1032e c1032e2 = new C1032e(1L, "vision.custom.ica");
        C1032e c1032e3 = new C1032e(1L, "vision.face");
        C1032e c1032e4 = new C1032e(1L, "vision.ica");
        C1032e c1032e5 = new C1032e(1L, "vision.ocr");
        C1032e c1032e6 = new C1032e(1L, "mlkit.langid");
        C1032e c1032e7 = new C1032e(1L, "mlkit.nlclassifier");
        C1032e c1032e8 = new C1032e(1L, "tflite_dynamite");
        C1032e c1032e9 = new C1032e(1L, "mlkit.barcode.ui");
        C1032e c1032e10 = new C1032e(1L, "mlkit.smartreply");
        C7306e c7306e = new C7306e();
        c7306e.ad("barcode", c1032e);
        c7306e.ad("custom_ica", c1032e2);
        c7306e.ad("face", c1032e3);
        c7306e.ad("ica", c1032e4);
        c7306e.ad("ocr", c1032e5);
        c7306e.ad("langid", c1032e6);
        c7306e.ad("nlclassifier", c1032e7);
        c7306e.ad("tflite_dynamite", c1032e8);
        c7306e.ad("barcode_ui", c1032e9);
        c7306e.ad("smart_reply", c1032e10);
        C11532e c11532e = (C11532e) c7306e.f14926e;
        if (c11532e != null) {
            throw c11532e.ad();
        }
        C12949e vip2 = C12949e.vip(c7306e.f14928e, (Object[]) c7306e.f14927e, c7306e);
        C11532e c11532e2 = (C11532e) c7306e.f14926e;
        if (c11532e2 != null) {
            throw c11532e2.ad();
        }
        metrica = vip2;
        C7306e c7306e2 = new C7306e();
        c7306e2.ad("com.google.android.gms.vision.barcode", c1032e);
        c7306e2.ad("com.google.android.gms.vision.custom.ica", c1032e2);
        c7306e2.ad("com.google.android.gms.vision.face", c1032e3);
        c7306e2.ad("com.google.android.gms.vision.ica", c1032e4);
        c7306e2.ad("com.google.android.gms.vision.ocr", c1032e5);
        c7306e2.ad("com.google.android.gms.mlkit.langid", c1032e6);
        c7306e2.ad("com.google.android.gms.mlkit.nlclassifier", c1032e7);
        c7306e2.ad("com.google.android.gms.tflite_dynamite", c1032e8);
        c7306e2.ad("com.google.android.gms.mlkit_smartreply", c1032e10);
        C11532e c11532e3 = (C11532e) c7306e2.f14926e;
        if (c11532e3 != null) {
            throw c11532e3.ad();
        }
        C12949e vip3 = C12949e.vip(c7306e2.f14928e, (Object[]) c7306e2.f14927e, c7306e2);
        C11532e c11532e4 = (C11532e) c7306e2.f14926e;
        if (c11532e4 != null) {
            throw c11532e4.ad();
        }
        license = vip3;
    }

    public static void ad(Context context, List list) {
        C0560e appmetrica;
        C17991e.vip.getClass();
        if (C17991e.ad(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        C1032e[] vip2 = vip(metrica, list);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new C6565e(vip2, 0));
        AbstractC9528e.metrica(!arrayList.isEmpty(), "APIs must not be empty.");
        AbstractC6950e abstractC6950e = new AbstractC6950e(context, C4480e.smaato, InterfaceC12516e.ad, C16258e.metrica);
        C9705e billing = C9705e.billing(arrayList, true);
        if (billing.f19206e.isEmpty()) {
            appmetrica = AbstractC1749e.appmetrica(new C4453e(0, false));
        } else {
            C9321e ad2 = C0381e.ad();
            ad2.license = new C1032e[]{AbstractC5032e.vip};
            ad2.metrica = true;
            ad2.vip = true;
            ad2.appmetrica = 27304;
            ad2.ad = new C17659e(abstractC6950e, billing, i);
            appmetrica = abstractC6950e.appmetrica(0, ad2.ad());
        }
        appmetrica.metrica(new C6173e(23));
    }

    public static C1032e[] vip(C12949e c12949e, List list) {
        C1032e[] c1032eArr = new C1032e[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C1032e c1032e = (C1032e) c12949e.get(list.get(i));
            AbstractC9528e.startapp(c1032e);
            c1032eArr[i] = c1032e;
        }
        return c1032eArr;
    }
}
