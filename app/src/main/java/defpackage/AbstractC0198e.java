package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0198e {
    public final String ad;

    public AbstractC0198e(String str) {
        this.ad = str;
        if (!AbstractC7999e.metrica.license(str)) {
            throw new C8750e("Invalid authScheme value: it should be token, but instead it is ".concat(str));
        }
    }

    public abstract String ad();

    public final String toString() {
        return ad();
    }
}
