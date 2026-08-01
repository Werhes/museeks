package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9663e {
    public static C7969e ad(String str) {
        try {
            if (str.equals("z")) {
                str = "Z";
            }
            return vip(ZoneId.of(str));
        } catch (Exception e) {
            if (e instanceof DateTimeException) {
                throw new IllegalArgumentException(e);
            }
            throw e;
        }
    }

    public static C7969e vip(ZoneId zoneId) {
        boolean z;
        if (zoneId instanceof ZoneOffset) {
            return new C7969e((ZoneOffset) zoneId);
        }
        try {
            z = zoneId.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            z = false;
        }
        if (!z) {
            return new C7969e(zoneId);
        }
        return new C7969e(zoneId);
    }

    public final InterfaceC5372e serializer() {
        return C2161e.ad;
    }
}
