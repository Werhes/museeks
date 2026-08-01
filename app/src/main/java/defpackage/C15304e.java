package defpackage;

import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15304e extends AbstractC14299e {
    public final int metrica;
    public final TextClassification vip;

    public C15304e(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.vip = textClassification;
        this.metrica = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.ad);
        sb.append(", textClassification=");
        sb.append(this.vip);
        sb.append(", index=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
