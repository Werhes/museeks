package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16118e extends AbstractC14299e {
    public final Function1 license;
    public final int metrica;
    public final String vip;

    public C16118e(Object obj, String str, int i, Function1 function1) {
        super(obj);
        this.vip = str;
        this.metrica = i;
        this.license = function1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.ad);
        sb.append(", label=\"");
        sb.append(this.vip);
        sb.append("\", leadingIcon=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
