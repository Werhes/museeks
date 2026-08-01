package defpackage;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class InputConnectionC16581e implements InputConnection {
    public final C12916e ad;
    public int appmetrica;
    public C0398e license;
    public int metrica;
    public boolean purchase;
    public final boolean vip;
    public final ArrayList billing = new ArrayList();
    public boolean yandex = true;

    public InputConnectionC16581e(C0398e c0398e, C12916e c12916e, boolean z) {
        this.ad = c12916e;
        this.vip = z;
        this.license = c0398e;
    }

    public final void ad(InterfaceC5366e interfaceC5366e) {
        this.metrica++;
        try {
            this.billing.add(interfaceC5366e);
        } finally {
            vip();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.yandex;
        if (!z) {
            return z;
        }
        this.metrica++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.yandex;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.billing.clear();
        this.metrica = 0;
        this.yandex = false;
        ArrayList arrayList = ((C13094e) this.ad.f25784e).startapp;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC7890e.billing(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.yandex;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.yandex;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.yandex;
        return z ? this.vip : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.yandex;
        if (z) {
            ad(new C6155e(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.yandex;
        if (!z) {
            return z;
        }
        ad(new C13266e(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.yandex;
        if (!z) {
            return z;
        }
        ad(new C5880e(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return vip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eؘؒؖ, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.yandex;
        if (!z) {
            return z;
        }
        ad(new Object());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C0398e c0398e = this.license;
        return TextUtils.getCapsMode(c0398e.ad.f20850e, C12347e.billing(c0398e.vip), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.purchase = z;
        if (z) {
            this.appmetrica = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC3062e.Signature(this.license);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C12347e.license(this.license.vip)) {
            return null;
        }
        return AbstractC10077e.admob(this.license).f20850e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC10077e.subscription(this.license, i).f20850e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC10077e.remoteconfig(this.license, i).f20850e;
    }

    public final void metrica(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.yandex;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    ad(new C8930e(0, this.license.ad.f20850e.length()));
                    break;
                case R.id.cut:
                    metrica(277);
                    return false;
                case R.id.copy:
                    metrica(278);
                    return false;
                case R.id.paste:
                    metrica(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.yandex;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((C13094e) this.ad.f25784e).purchase.invoke(new C10120e(i2));
            }
            i2 = 1;
            ((C13094e) this.ad.f25784e).purchase.invoke(new C10120e(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.yandex;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.yandex
            if (r0 == 0) goto L79
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            eّۨؒ r4 = r9.ad
            java.lang.Object r4 = r4.f25784e
            eؘْۚ r4 = (defpackage.C13094e) r4
            eؘٟٛ r4 = r4.advert
            java.lang.Object r7 = r4.metrica
            monitor-enter(r7)
            r4.purchase = r5     // Catch: java.lang.Throwable -> L6f
            r4.billing = r6     // Catch: java.lang.Throwable -> L6f
            r4.yandex = r1     // Catch: java.lang.Throwable -> L6f
            r4.startapp = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.appmetrica = r2     // Catch: java.lang.Throwable -> L6f
            eؑٚٞ r10 = r4.adcel     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.ad()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L77
        L71:
            r4.license = r3     // Catch: java.lang.Throwable -> L6f
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L77:
            monitor-exit(r7)
            throw r10
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputConnectionC16581e.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eؕٛؓ] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.yandex;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C13094e) this.ad.f25784e).adcel.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.yandex;
        if (z) {
            ad(new C2910e(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.yandex;
        if (z) {
            ad(new C7570e(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.yandex;
        if (!z) {
            return z;
        }
        ad(new C8930e(i, i2));
        return true;
    }

    public final boolean vip() {
        int i = this.metrica - 1;
        this.metrica = i;
        if (i == 0) {
            ArrayList arrayList = this.billing;
            if (!arrayList.isEmpty()) {
                ((C13094e) this.ad.f25784e).appmetrica.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.metrica > 0;
    }
}
