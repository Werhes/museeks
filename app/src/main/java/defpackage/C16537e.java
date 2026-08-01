package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16537e implements InterfaceC5039e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C0583e f32418e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0583e f32419e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f32420e;

    public C16537e(Map map, Function1 function1) {
        C0583e c0583e;
        this.f32420e = function1;
        if (map == null || map.isEmpty()) {
            c0583e = null;
        } else {
            c0583e = new C0583e(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c0583e.amazon(entry.getKey(), entry.getValue());
            }
        }
        this.f32419e = c0583e;
    }

    @Override // defpackage.InterfaceC5039e
    public final Object appmetrica(String str) {
        C0583e c0583e = this.f32419e;
        List list = c0583e != null ? (List) c0583e.advert(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c0583e != null) {
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.InterfaceC5039e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map license() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16537e.license():java.util.Map");
    }

    @Override // defpackage.InterfaceC5039e
    public final boolean metrica(Object obj) {
        return ((Boolean) this.f32420e.invoke(obj)).booleanValue();
    }

    @Override // defpackage.InterfaceC5039e
    public final InterfaceC10153e purchase(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC15211e.license(str.charAt(i))) {
                C0583e c0583e = this.f32418e;
                if (c0583e == null) {
                    long[] jArr = AbstractC12981e.ad;
                    c0583e = new C0583e();
                    this.f32418e = c0583e;
                }
                Object billing = c0583e.billing(str);
                if (billing == null) {
                    billing = new ArrayList();
                    c0583e.amazon(str, billing);
                }
                ((List) billing).add(function0);
                return new C15024e(3, c0583e, str, function0);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
