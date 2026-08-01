package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15739e extends AbstractC9450e {
    public final /* synthetic */ C18278e appmetrica;
    public int license;
    public File[] metrica;
    public boolean vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15739e(C18278e c18278e, File file) {
        super(file);
        this.appmetrica = c18278e;
    }

    @Override // defpackage.AbstractC8071e
    public final File ad() {
        Function2 function2;
        boolean z = this.vip;
        File file = this.ad;
        if (!z) {
            this.vip = true;
            return file;
        }
        File[] fileArr = this.metrica;
        if (fileArr != null && this.license >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.metrica = listFiles;
            if (listFiles == null && (function2 = this.appmetrica.f35720e.metrica) != null) {
                function2.invoke(file, new C17690e(file, 0));
            }
            File[] fileArr2 = this.metrica;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.metrica;
        int i = this.license;
        this.license = i + 1;
        return fileArr3[i];
    }
}
