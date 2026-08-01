package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۧۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18160e implements InterfaceC9842e {
    @Override // defpackage.InterfaceC9842e
    public final File ad(String str, String str2) {
        File file = new File(str, str2);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file;
    }

    @Override // defpackage.InterfaceC9842e
    public final Uri license(File file, String str, String str2) {
        return Uri.fromFile(file);
    }

    @Override // defpackage.InterfaceC9842e
    public final void metrica(File file, String str, String str2) {
        String[] list;
        do {
            if (file != null) {
                file.delete();
            }
            file = file != null ? file.getParentFile() : null;
            if (file == null || !file.isDirectory() || (list = file.list()) == null) {
                return;
            }
        } while (list.length == 0);
    }

    @Override // defpackage.InterfaceC9842e
    public final boolean vip(String str, String str2) {
        return new File(str, str2).exists();
    }
}
