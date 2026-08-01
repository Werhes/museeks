package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14780e {
    public abstract C9710e ad();

    public abstract Object license(InterfaceC5374e interfaceC5374e);

    public final Object metrica(String str) {
        String str2;
        try {
            try {
                return license(AbstractC14385e.metrica(ad().metrica, str, vip()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (C14120e e2) {
            throw new IllegalArgumentException("Failed to parse value from '" + ((Object) str) + '\'', e2);
        }
    }

    public abstract InterfaceC5374e vip();
}
