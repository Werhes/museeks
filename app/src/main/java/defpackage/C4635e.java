package defpackage;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4635e extends AbstractC10888e {
    public final Field vip;

    public C4635e(Field field) {
        this.vip = field;
    }

    @Override // defpackage.AbstractC10888e
    public final String vip() {
        StringBuilder sb = new StringBuilder();
        Field field = this.vip;
        sb.append(AbstractC7903e.ad(field.getName()));
        sb.append("()");
        sb.append(AbstractC2677e.vip(field.getType()));
        return sb.toString();
    }
}
