package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11415e implements InterfaceC9842e {
    public final Context ad;

    public C11415e(Context context) {
        this.ad = context;
    }

    @Override // defpackage.InterfaceC9842e
    public final File ad(String str, String str2) {
        File file = new File(this.ad.getFilesDir(), "saf_tempFile.".concat(AbstractC5304e.m1876synchronized('.', str2, BuildConfig.FLAVOR)));
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file;
    }

    public final C1832e appmetrica(String str, String str2) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentsContract.getTreeDocumentId(parse));
        if (AbstractC5304e.m1858extends(str) != '/') {
            str2 = AbstractC17861e.Signature("/", str2);
        }
        sb.append(str2);
        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, sb.toString());
        C1832e c1832e = new C1832e(null);
        c1832e.metrica = this.ad;
        c1832e.license = buildDocumentUriUsingTree;
        return c1832e;
    }

    @Override // defpackage.InterfaceC9842e
    public final Uri license(File file, String str, String str2) {
        C1832e c1832e;
        Uri uri;
        C1832e c1832e2;
        Uri uri2;
        Uri parse = Uri.parse(str);
        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, DocumentsContract.getTreeDocumentId(parse));
        Context context = this.ad;
        C1832e c1832e3 = new C1832e(null, context, buildDocumentUriUsingTree);
        List m1869private = AbstractC5304e.m1869private(str2, new String[]{"/"}, 6);
        int size = m1869private.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (c1832e3 != null && i2 != AbstractC6874e.billing(m1869private)) {
                String str3 = (String) m1869private.get(i2);
                C1832e[] license = c1832e3.license();
                int length = license.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        c1832e2 = license[i3];
                        if (!AbstractC6507e.loadAd(str3, c1832e2.vip(), true)) {
                            i3++;
                        }
                    } else {
                        c1832e2 = null;
                    }
                }
                if (c1832e2 == null) {
                    String str4 = (String) m1869private.get(i2);
                    switch (c1832e3.vip) {
                        case 0:
                            throw new UnsupportedOperationException();
                        default:
                            Context context2 = c1832e3.metrica;
                            try {
                                uri2 = DocumentsContract.createDocument(context2.getContentResolver(), c1832e3.license, "vnd.android.document/directory", str4);
                            } catch (Exception unused) {
                                uri2 = null;
                            }
                            if (uri2 != null) {
                                c1832e2 = new C1832e(c1832e3, context2, uri2);
                                break;
                            } else {
                                c1832e2 = null;
                                break;
                            }
                    }
                }
                c1832e3 = c1832e2;
            }
        }
        if (c1832e3 == null) {
            throw new IllegalArgumentException(AbstractC17861e.admob("Couldn't create a directory for root=", str, " and path=", str2).toString());
        }
        String str5 = (String) AbstractC13480e.m3570break(m1869private);
        C1832e[] license2 = c1832e3.license();
        int length2 = license2.length;
        while (true) {
            if (i < length2) {
                C1832e c1832e4 = license2[i];
                if (AbstractC6507e.loadAd(str5, c1832e4.vip(), true)) {
                    c1832e = c1832e4;
                } else {
                    i++;
                }
            } else {
                c1832e = null;
            }
        }
        if (c1832e == null) {
            String str6 = (String) AbstractC13480e.m3570break(m1869private);
            switch (c1832e3.vip) {
                case 0:
                    throw new UnsupportedOperationException();
                default:
                    Context context3 = c1832e3.metrica;
                    try {
                        uri = DocumentsContract.createDocument(context3.getContentResolver(), c1832e3.license, "application/ytkameme", str6);
                    } catch (Exception unused2) {
                        uri = null;
                    }
                    if (uri != null) {
                        c1832e = new C1832e(c1832e3, context3, uri);
                        break;
                    } else {
                        c1832e = null;
                        break;
                    }
            }
        }
        if (c1832e == null) {
            StringBuilder tapsense = AbstractC17861e.tapsense("Couldn't create a file for root=", str, ", path=", str2, " and directory=");
            tapsense.append(c1832e3.metrica());
            throw new IllegalArgumentException(tapsense.toString().toString());
        }
        OutputStream openOutputStream = context.getContentResolver().openOutputStream(c1832e.metrica(), "w");
        if (openOutputStream == null) {
            StringBuilder tapsense2 = AbstractC17861e.tapsense("Couldn't create a file for root=", str, ", path=", str2, ", directory=");
            tapsense2.append(c1832e3.metrica());
            tapsense2.append(" and file=");
            tapsense2.append(c1832e.metrica());
            throw new IllegalArgumentException(tapsense2.toString().toString());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                AbstractC13671e.license(fileInputStream, openOutputStream);
                openOutputStream.close();
                fileInputStream.close();
                file.delete();
                return c1832e.metrica();
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.InterfaceC9842e
    public final void metrica(File file, String str, String str2) {
        boolean equals;
        file.delete();
        C1832e appmetrica = appmetrica(str, str2);
        do {
            switch (appmetrica.vip) {
                case 0:
                    DocumentsContract.deleteDocument(appmetrica.metrica.getContentResolver(), appmetrica.license);
                    break;
                default:
                    try {
                        DocumentsContract.deleteDocument(appmetrica.metrica.getContentResolver(), appmetrica.license);
                        break;
                    } catch (Exception unused) {
                        break;
                    }
            }
            appmetrica = appmetrica.ad;
            if (appmetrica == null) {
                return;
            }
            switch (appmetrica.vip) {
                case 0:
                    equals = "vnd.android.document/directory".equals(AbstractC5097e.advert(appmetrica.metrica, appmetrica.license, "mime_type"));
                    break;
                default:
                    equals = "vnd.android.document/directory".equals(AbstractC5097e.advert(appmetrica.metrica, appmetrica.license, "mime_type"));
                    break;
            }
            if (!equals) {
                return;
            }
        } while (appmetrica.license().length == 0);
    }

    @Override // defpackage.InterfaceC9842e
    public final boolean vip(String str, String str2) {
        return appmetrica(str, str2).ad();
    }
}
