package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832e {
    public final C1832e ad;
    public Uri license;
    public Context metrica;
    public final /* synthetic */ int vip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1832e(C1832e c1832e) {
        this(c1832e, (byte) 0);
        this.vip = 0;
    }

    public C1832e(C1832e c1832e, byte b) {
        this.ad = c1832e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1832e(C1832e c1832e, Context context, Uri uri) {
        this(c1832e, (byte) 0);
        this.vip = 1;
        this.metrica = context;
        this.license = uri;
    }

    public final boolean ad() {
        switch (this.vip) {
            case 0:
                return AbstractC5097e.license(this.metrica, this.license);
            default:
                return AbstractC5097e.license(this.metrica, this.license);
        }
    }

    public final C1832e[] license() {
        switch (this.vip) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.metrica;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.license;
                Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
                ArrayList arrayList = new ArrayList();
                Cursor cursor = null;
                try {
                    try {
                        try {
                            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                            while (cursor.moveToNext()) {
                                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                            }
                        } catch (Exception e) {
                            Log.w("DocumentFile", "Failed query: " + e);
                            if (cursor != null) {
                                try {
                                    AbstractC4653e.firebase(cursor);
                                } catch (RuntimeException e2) {
                                    throw e2;
                                }
                            }
                        }
                        try {
                            AbstractC4653e.firebase(cursor);
                        } catch (RuntimeException e3) {
                            throw e3;
                        }
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                AbstractC4653e.firebase(cursor);
                            } catch (RuntimeException e4) {
                                throw e4;
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
                Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                C1832e[] c1832eArr = new C1832e[uriArr.length];
                for (int i = 0; i < uriArr.length; i++) {
                    c1832eArr[i] = new C1832e(this, context, uriArr[i]);
                }
                return c1832eArr;
        }
    }

    public final Uri metrica() {
        switch (this.vip) {
            case 0:
                return this.license;
            default:
                return this.license;
        }
    }

    public final String vip() {
        switch (this.vip) {
            case 0:
                return AbstractC5097e.advert(this.metrica, this.license, "_display_name");
            default:
                return AbstractC5097e.advert(this.metrica, this.license, "_display_name");
        }
    }
}
