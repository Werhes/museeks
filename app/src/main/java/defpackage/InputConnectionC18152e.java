package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class InputConnectionC18152e implements InputConnection {
    public final C17097e ad;
    public InputConnection vip;

    public InputConnectionC18152e(InputConnection inputConnection, C17097e c17097e) {
        this.ad = c17097e;
        this.vip = inputConnection;
    }

    public void ad(InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            if (inputConnection != null) {
                ad(inputConnection);
                this.vip = null;
            }
            this.ad.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        InputConnection inputConnection = this.vip;
        if (inputConnection != null) {
            return inputConnection.setSelection(i, i2);
        }
        return false;
    }
}
