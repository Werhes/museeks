package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8589e extends AbstractC10385e {
    public abstract Object ad();

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof C2055e) {
            obj = "\"" + ((Object) ((C2055e) this).ad) + '\"';
        } else {
            obj = ad().toString();
        }
        return AbstractC4653e.applovin(sb, obj, ')');
    }
}
