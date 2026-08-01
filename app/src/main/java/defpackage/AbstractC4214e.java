package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4214e {
    public static final SparseArray ad;
    public static final HashMap license;
    public static final AtomicReference metrica;
    public static final SparseArray vip;

    static {
        SparseArray sparseArray = new SparseArray();
        ad = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        vip = sparseArray2;
        metrica = new AtomicReference();
        sparseArray.put(-1, EnumC9390e.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC9390e.FORMAT_CODE_128);
        sparseArray.put(2, EnumC9390e.FORMAT_CODE_39);
        sparseArray.put(4, EnumC9390e.FORMAT_CODE_93);
        sparseArray.put(8, EnumC9390e.FORMAT_CODABAR);
        sparseArray.put(16, EnumC9390e.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC9390e.FORMAT_EAN_13);
        sparseArray.put(64, EnumC9390e.FORMAT_EAN_8);
        sparseArray.put(128, EnumC9390e.FORMAT_ITF);
        sparseArray.put(PSKKeyManager.MAX_KEY_LENGTH_BYTES, EnumC9390e.FORMAT_QR_CODE);
        sparseArray.put(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, EnumC9390e.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC9390e.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC9390e.FORMAT_PDF417);
        sparseArray.put(4096, EnumC9390e.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC17723e.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC17723e.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC17723e.TYPE_EMAIL);
        sparseArray2.put(3, EnumC17723e.TYPE_ISBN);
        sparseArray2.put(4, EnumC17723e.TYPE_PHONE);
        sparseArray2.put(5, EnumC17723e.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC17723e.TYPE_SMS);
        sparseArray2.put(7, EnumC17723e.TYPE_TEXT);
        sparseArray2.put(8, EnumC17723e.TYPE_URL);
        sparseArray2.put(9, EnumC17723e.TYPE_WIFI);
        sparseArray2.put(10, EnumC17723e.TYPE_GEO);
        sparseArray2.put(11, EnumC17723e.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC17723e.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        license = hashMap;
        hashMap.put(1, EnumC16183e.CODE_128);
        hashMap.put(2, EnumC16183e.CODE_39);
        hashMap.put(4, EnumC16183e.CODE_93);
        hashMap.put(8, EnumC16183e.CODABAR);
        hashMap.put(16, EnumC16183e.DATA_MATRIX);
        hashMap.put(32, EnumC16183e.EAN_13);
        hashMap.put(64, EnumC16183e.EAN_8);
        hashMap.put(128, EnumC16183e.ITF);
        hashMap.put(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), EnumC16183e.QR_CODE);
        hashMap.put(Integer.valueOf(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE), EnumC16183e.UPC_A);
        hashMap.put(1024, EnumC16183e.UPC_E);
        hashMap.put(2048, EnumC16183e.PDF417);
        hashMap.put(4096, EnumC16183e.AZTEC);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, eؑؓؐ] */
    public static C12720e ad(C3098e c3098e) {
        int i = c3098e.ad;
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 12);
        HashMap hashMap = license;
        if (i == 0) {
            Collection values = hashMap.values();
            if (values instanceof Collection) {
                Collection collection = values;
                crashlyticsVar.m195case(collection.size() + crashlyticsVar.f1117e);
                if (collection instanceof AbstractC14048e) {
                    crashlyticsVar.f1117e = ((AbstractC14048e) collection).appmetrica(crashlyticsVar.f1117e, (Object[]) crashlyticsVar.f1119e);
                }
            }
            Iterator it = values.iterator();
            while (it.hasNext()) {
                crashlyticsVar.m197implements(it.next());
            }
        } else {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    crashlyticsVar.m197implements((EnumC16183e) entry.getValue());
                }
            }
        }
        ?? obj = new Object();
        obj.f1185e = crashlyticsVar.m196catch();
        return new C12720e(obj);
    }

    public static boolean metrica() {
        AtomicReference atomicReference = metrica;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context vip2 = C2316e.metrica().vip();
        C7895e c7895e = C5903e.f12454e;
        boolean z = C0781e.ad(vip2, ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    public static void vip(C17856e c17856e, EnumC3305e enumC3305e) {
        c17856e.vip(new C2691e(24, enumC3305e), EnumC11135e.ON_DEVICE_BARCODE_LOAD);
    }
}
