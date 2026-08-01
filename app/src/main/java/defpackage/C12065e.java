package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12065e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Map f24189e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24190e;

    public /* synthetic */ C12065e(int i, Map map) {
        this.f24190e = i;
        this.f24189e = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f24190e) {
            case 0:
                String str = (String) obj;
                C4903e c4903e = (C4903e) this.f24189e.get(str);
                if (c4903e != null) {
                    return c4903e;
                }
                throw new IllegalStateException((str + " key should be downloaded, but not present in key database").toString());
            default:
                C10224e c10224e = (C10224e) obj;
                Iterator it = this.f24189e.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!AbstractC13480e.ads((List) entry.getValue(), c10224e.f20233e.get((CaptureResult.Key) entry.getKey()))) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
