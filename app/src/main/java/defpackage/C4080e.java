package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4080e extends AbstractC9450e {
    public boolean appmetrica;
    public int license;
    public File[] metrica;
    public final /* synthetic */ C18278e purchase;
    public boolean vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4080e(C18278e c18278e, File file) {
        super(file);
        this.purchase = c18278e;
    }

    @Override // defpackage.AbstractC8071e
    public final File ad() {
        int i;
        boolean z = this.appmetrica;
        File file = this.ad;
        if (!z && this.metrica == null) {
            File[] listFiles = file.listFiles();
            this.metrica = listFiles;
            if (listFiles == null) {
                Function2 function2 = this.purchase.f35720e.metrica;
                if (function2 != null) {
                    function2.invoke(file, new C17690e(file, 0));
                }
                this.appmetrica = true;
            }
        }
        File[] fileArr = this.metrica;
        if (fileArr != null && (i = this.license) < fileArr.length) {
            this.license = i + 1;
            return fileArr[i];
        }
        if (this.vip) {
            return null;
        }
        this.vip = true;
        return file;
    }
}
