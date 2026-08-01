package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5167e extends AbstractC1060e {
    public static void pro(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void signatures(Comparator comparator, List list) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
