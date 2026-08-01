package defpackage;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12485e {
    public final String ad;
    public final HashMap vip = new HashMap();

    public C12485e(String str) {
        this.ad = str;
    }

    public final File ad(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Unable to find path from root: " + uri);
        }
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.vip.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            if (FileProvider.ad(path).startsWith(FileProvider.ad(path2) + '/')) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
