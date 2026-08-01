package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11984e implements FilenameFilter {
    public final /* synthetic */ int ad;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.ad) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
